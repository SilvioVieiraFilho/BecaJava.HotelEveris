package br.app.HotelEveris;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

import br.app.HotelEveris.response.BaseResponse;

public class Aplicacao {
	
	
	@Autowired
	
	private BaseResponse response; 
	
	

	private final static String QUEUE_NAME = "FilaTransferencia";

	public static void main(String[] argv) throws Exception {

		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();

		channel.queueDeclare(QUEUE_NAME, false, false, false, null);
		System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

		DeliverCallback deliverCallback = (consumerTag, delivery) -> {

			String message = new String(delivery.getBody(), "UTF-8");//

			RestTemplate restTemplate = new RestTemplate();

			String uri = "http://localhost:8081/operacao/transferencia";

			restTemplate.postForObject(uri, message,BaseResponse.class );

			// resttemplate e vai manda api pro banco operacao/transferencia

		};
		channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> {
		});
	}
}

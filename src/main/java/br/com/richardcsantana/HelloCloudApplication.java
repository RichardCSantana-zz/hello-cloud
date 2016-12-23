package br.com.richardcsantana;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 * @author richard.santana
 */
@SpringCloudApplication
@EnableCircuitBreaker
public class HelloCloudApplication {

	public static void main(final String[] args) {
		SpringApplication.run(HelloCloudApplication.class, args);
	}

}

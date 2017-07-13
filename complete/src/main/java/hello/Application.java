package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory
			.getLogger(Application.class);

	public static void main(String args[]) {
		SpringApplication.run(Application.class);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {

			// Setup for restTemplate using US ZipCode API
			Response response = restTemplate.getForObject(
					"http://services.groupkt.com/state/get/USA/all",
					Response.class);
			log.info(response.toString());

			// Setup for restTemplate using our User API
			 User user_get = restTemplate.getForObject(
			 "http://localhost:8080/api/user/1", User.class);
			 log.info(user_get.toString());

//			Setup for restTemplate to Post using User API
			User user_post = new User("Username","FirstName","LastName"); 
			 User newUser = restTemplate.postForObject("http://localhost:8080/api/user",user_post, User.class);
			 log.info(newUser.toString());

		};

	}
}
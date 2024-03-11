package experiment.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerApplication {
	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}
}

@RestController
class MyController{
	@GetMapping("/")
	public String helloWorld(){
		return "Hello World!!!";
	}
}
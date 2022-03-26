package pj.pjatk.mikhol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = "test")
public class MikholApplication {

	public static void main(String[] args) {
		SpringApplication.run(MikholApplication.class, args);
	}

}

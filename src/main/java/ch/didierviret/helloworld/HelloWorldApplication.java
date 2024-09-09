package ch.didierviret.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.didierviret.helloworld.model.HelloWorld;
import ch.didierviret.helloworld.service.BusinessService;

@SpringBootApplication
public class HelloWorldApplication implements CommandLineRunner {
	@Autowired
	private BusinessService bs;

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	@Override
    public void run(String... args) throws Exception {
		HelloWorld hw = bs.getHelloWorld();
		System.out.println(hw);

        System.out.println("Hello World !");
    }

}

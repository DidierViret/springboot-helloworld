package ch.didierviret.springboot_helloworld;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ch.didierviret.helloworld.service.BusinessService;

@SpringBootTest
class HelloWorldApplicationTests {
	@Autowired
	private BusinessService bs;

	@Test
	void contextLoads() {
	}

	@Test
	void testHelloWorldValue() {
		String expected = this.bs.getHelloWorld().getValue();
		String result = this.bs.getHelloWorld().toString();

		assertEquals(expected, result);
	}

}

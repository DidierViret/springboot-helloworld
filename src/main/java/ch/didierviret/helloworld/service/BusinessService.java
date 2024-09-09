package ch.didierviret.helloworld.service;

import org.springframework.stereotype.Component;

import ch.didierviret.helloworld.model.HelloWorld;

@Component
public class BusinessService {

    public HelloWorld getHelloWorld() {
        return new HelloWorld();
    }
}

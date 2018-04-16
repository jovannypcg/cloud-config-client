package com.figureeight.cclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudClientApplication implements CommandLineRunner {
    @Value("${custom_properties.developer}")
    private String developer;

    @Value("${custom_properties.environment}")
    private String environment;

	public static void main(String[] args) {
		SpringApplication.run(CloudClientApplication.class, args);
	}

    @Override
    public void run(String... args) {
        System.out.println(" =======> Developer  : " + developer);
        System.out.println(" =======> Environment: " + environment);
    }
}

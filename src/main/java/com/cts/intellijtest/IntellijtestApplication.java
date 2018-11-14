package com.cts.intellijtest;

		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;
		import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class IntellijtestApplication {
	public static void main(String[] args) {
		SpringApplication.run(IntellijtestApplication.class, args);
	}
}

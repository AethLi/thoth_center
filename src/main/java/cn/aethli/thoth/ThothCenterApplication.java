package cn.aethli.thoth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ThothCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThothCenterApplication.class, args);
	}

}

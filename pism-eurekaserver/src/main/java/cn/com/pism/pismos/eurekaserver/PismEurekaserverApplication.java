package cn.com.pism.pismos.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PismEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(PismEurekaserverApplication.class, args);
	}
}

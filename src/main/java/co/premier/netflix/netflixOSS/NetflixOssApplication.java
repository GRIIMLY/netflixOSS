package co.premier.netflix.netflixOSS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableEurekaServer
@EnableZuulProxy
public class NetflixOssApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixOssApplication.class, args);
	}

}

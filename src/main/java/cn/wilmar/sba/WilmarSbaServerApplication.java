package cn.wilmar.sba;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class WilmarSbaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WilmarSbaServerApplication.class, args);
	}
}

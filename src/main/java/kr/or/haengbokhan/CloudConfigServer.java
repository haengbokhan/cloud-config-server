package kr.or.haengbokhan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CloudConfigServer {

    public static void main(final String[] options) {
        SpringApplication.run(CloudConfigServer.class, options);
    }

}
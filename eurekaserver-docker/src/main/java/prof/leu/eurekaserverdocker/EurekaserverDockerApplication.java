package prof.leu.eurekaserverdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaserverDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaserverDockerApplication.class, args);
    }

}

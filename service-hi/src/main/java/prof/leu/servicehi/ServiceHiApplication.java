package prof.leu.servicehi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class ServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceHiApplication.class, args);
    }
    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home(@RequestParam(value = "name", defaultValue = "sdds") String name) {
        return "hi "+name+",i am from port:" +port;
    }
    @RequestMapping("/hi2")
    public UserDetails home2(@RequestParam(value = "id" ,defaultValue = "1") String id) {

        if (id.equals("1"))
        return new UserDetails("John",
                "john.doe@gmail.com",
                "5168161922L",
                "NewYork");
        else
            return null;

    }


}

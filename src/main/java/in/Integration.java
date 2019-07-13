package in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@PropertySource(value = {
        "application.properties",
        "file:/etc/oms/log.properties"}, ignoreResourceNotFound = true)
@SpringBootApplication
public class Integration {
    public static void main(String[] args) {
        SpringApplication.run(Integration.class, args);
    }

}

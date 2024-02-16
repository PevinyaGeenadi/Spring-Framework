package lk.ijse.gdse.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

@ComponentScan
@Configuration
public class AppConfig {
    @Order(2)
    @Bean
    public String mySring1() {
        return "IJSE";
    }

    @Order(3)
    @Bean
    @Primary
    public String myString2() {
        return "ESOFT";
    }

    @Order(1)
    @Bean
    public String myString3() {
        return "SLIT";
    }
}
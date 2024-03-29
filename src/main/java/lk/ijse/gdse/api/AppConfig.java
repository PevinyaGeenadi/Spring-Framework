package lk.ijse.gdse.api;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

@ComponentScan
@Configuration
public class AppConfig {
    @Qualifier("note")
    @Order(2)
    @Bean
    public String mySring1() {
        return "IJSE";
    }

    @Qualifier("note")
    @Order(3)
    @Bean
    public String myString2() {
        return "ESOFT";
    }

    @Order(1)
    @Bean
    public String myString3() {
        return "SLIT";
    }
}
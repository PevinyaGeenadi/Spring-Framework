package lk.ijse.gdse.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class AppConfig {
    @Bean
    public String myString1(){
        return null;
    }

    @Bean
    public String myString2(){
        return null;
    }

    @Bean
    public String myString3(){
        return null;
    }
}
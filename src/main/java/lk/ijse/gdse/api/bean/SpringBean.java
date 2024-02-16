package lk.ijse.gdse.api.bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean(String name){
        System.out.println("SpringBean() + Constructor");
    }
}

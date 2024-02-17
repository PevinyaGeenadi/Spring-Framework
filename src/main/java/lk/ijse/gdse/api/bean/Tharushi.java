package lk.ijse.gdse.api.bean;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Long Hair")
public class Tharushi implements GoodGirl{
    public Tharushi() {

        System.out.println("Tharushi - constructor");
    }


    @Override
    public void love(){
          System.out.println("Tharushi love him so much");
    }
}

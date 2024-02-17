package lk.ijse.gdse.api.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Component
public class SpringBean {
    public SpringBean(@Qualifier("note")String[] nameList){
        System.out.println("SpringBean() + constructor" + nameList);
        System.out.println(Arrays.toString(nameList));

    }


    /*public SpringBean(List<String> nameList) {
        System.out.println("SpringBean() - constructor -" + nameList);
        System.out.println(nameList);
    }*/

    /*public SpringBean(Collection<String> nameList) {
        System.out.println("SpringBean() - constructor - " + nameList);
        System.out.println(nameList);
    }*/

    /* public SpringBean(Set<String> nameList) {
        System.out.println("SpringBean() - constructor -" + nameList);
        System.out.println(nameList);
    } */

    /*public SpringBean(Map<String,String> nameList) {
        System.out.println("SpringBean() - constructor - " + nameList);
        System.out.println(nameList);
    }*/

     /* public SpringBean(List<GoodGirl> GoodGirl) {
        System.out.println("SpringBean() - constructor -" + GoodGirl);
        System.out.println(GoodGirl);
    }*/
}
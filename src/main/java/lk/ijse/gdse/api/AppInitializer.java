package lk.ijse.gdse.api;

import lk.ijse.gdse.api.bean.Boy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        Boy boy = ctx.getBean(Boy.class);
        System.out.println(boy);
    }
}

package lk.ijse.gdse.api.bean;

import lk.ijse.gdse.api.util.Injector;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("Lahiru")
public class Boy implements Injector, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    @Autowired
    private GoodGirl gf;

//costructor injection
    public Boy(GoodGirl gf) {
        this.gf=gf;
        System.out.println("Boy Constructor");
        System.out.println("Have I got a good girlfriend "+gf);
        gf.love();
    }

    @PostConstruct
    public void initialize(){
        System.out.println("Have I got a good girlfriend"+gf);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Lahiru BeanNameAware : "+s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Lahiru BeanFactoryAware : "+beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Lahiru ApplicationContextAware : "+applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Lahiru InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Lahiru DisposableBean");
    }

    @Override
    public void inject(GoodGirl gf) {

    }
}

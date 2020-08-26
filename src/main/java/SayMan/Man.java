package SayMan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Man {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppManSayConfig.class);
        HelloManSay helloMan = context.getBean("helloMan", HelloManSay.class);
        helloMan.helloSay();
    }
}

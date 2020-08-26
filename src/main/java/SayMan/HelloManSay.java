package SayMan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloManSay implements HelloMan {
    @Value("Kolya")
    String name;

    public HelloManSay() {
    }

    public HelloManSay(String name) {
        this.name = name;
    }

    @Override
    public void helloSay() {
        System.out.println("Hello " + this.name);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

package AutowiredDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Freshman freshman = ctx.getBean(Freshman.class);
        System.out.println("Freshman: " + freshman.getName());
        System.out.println("Dorm Room: " + freshman.getRoom().getLocation());
    }
}

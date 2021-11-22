import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beantwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanone =
                (Cat) applicationContext.getBean("cat");
        Cat beanthree =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean.equals(beantwo));
        System.out.println(beanone.equals(beanthree));
    }
}
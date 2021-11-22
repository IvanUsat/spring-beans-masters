package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
public class AnimalsCage {


    private Animal animal;
    public Timer timer;

    public Timer getTimer() {
        return timer;
    }


    @Autowired
    public AnimalsCage(@Qualifier("dog") Animal animal,
                       @Qualifier("timer") Timer timer){
        this.animal = animal;
        this.timer = timer;
    }

    public AnimalsCage() {
    }


    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }

}



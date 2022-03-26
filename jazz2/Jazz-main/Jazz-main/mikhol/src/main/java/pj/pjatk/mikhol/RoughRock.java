package pj.pjatk.mikhol;

import org.springframework.stereotype.Component;

@Component
public class RoughRock {
    public RoughRock(SmoothJazz smoothJazz) {
        System.out.println("RoughRock activated");
        smoothJazz.printJazz();
    }
    public void printRock(){
        System.out.println("RoughRock: printRock");
    }
}

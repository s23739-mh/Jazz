package pj.pjatk.mikhol;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.ImportResource;



public class SwiftySwing {
    public SwiftySwing(ApplicationContext applicationContext){
    SmoothJazz jazz = applicationContext.getBean("smoothJazz",SmoothJazz.class);
    RoughRock rock = applicationContext.getBean("roughRock",RoughRock.class);
    rock.printRock();
    jazz.printJazz();
    }

}

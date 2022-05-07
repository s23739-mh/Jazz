package pj.pjatk.mikhol.classes.music;

import org.springframework.context.ApplicationContext;


public class SwiftySwing {
    public SwiftySwing(ApplicationContext applicationContext){
    SmoothJazz jazz = applicationContext.getBean("smoothJazz",SmoothJazz.class);
    RoughRock rock = applicationContext.getBean("roughRock",RoughRock.class);
    rock.printRock();
    jazz.printJazz();
    }

}

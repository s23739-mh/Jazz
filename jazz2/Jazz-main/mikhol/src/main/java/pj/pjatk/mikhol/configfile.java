package pj.pjatk.mikhol;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class configfile {
    @Bean
    public Pojofile gojofile (@Value("${my.custom.property:Default Property}") String valueFromProperties){

        System.out.println(valueFromProperties);

        return new Pojofile();
    }
    @Bean
    public List<String> defaultData()
    {
        return List.of("string1","string2","string3","string4","string5");
    }

    //(@Value("${random}")
    @Bean
    @ConditionalOnExpression("${random:true}")
    public Pojofile dojofile (@Value("#{new Boolean('${random}')}") Boolean condition){
        System.out.println("pog");
        return new Pojofile();
    }
}

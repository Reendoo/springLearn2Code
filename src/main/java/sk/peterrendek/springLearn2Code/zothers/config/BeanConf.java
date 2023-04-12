package sk.peterrendek.springLearn2Code.zothers.config;

import org.springframework.context.annotation.Configuration;
import sk.strangerpackage.StrangersClass;

@Configuration
public class BeanConf {
    public StrangersClass getChoral(){
        return new StrangersClass();
    }
}

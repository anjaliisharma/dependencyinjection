package guru.springframework.dependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("SP")
@Service("I18nService")
public class I18nSpanishService implements GreetingService{
    @Override
    public String sayGreeting(){

        return "Hola Mundo  -- spanish";
    }
}

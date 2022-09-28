package guru.springframework.dependencyinjection;

import guru.springframework.dependencyinjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyinjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx= SpringApplication.run(DependencyinjectionApplication.class, args);

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		MyController myController=(MyController) ctx.getBean("myController");
		//String greeting = myController.sayHello();
        System.out.println("--------------- Primary bean");
		System.out.println(myController.sayHello());

		System.out.println("----------------  Property");

		PropertyInjectedController propertyInjectedController=(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------------  Setter");

		SetterInjectedController setterInjectedController =(SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----------------  Constructor");

		ConstructorInjectedController constructorInjectedController =(ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		I18nController i18nController=(I18nController) ctx.getBean("i18nController");
		System.out.println("--------------- using Profile");
		System.out.println(i18nController.sayHello());

		//PetController petController=(PetController) ctx.getBean("petController");
		//PetController petController = ctx.getBean("petController", PetController.class);
		//System.out.println("--------------- Which pet is the best");
		//System.out.println(petController.whichPetIsTheBest());

	}

}

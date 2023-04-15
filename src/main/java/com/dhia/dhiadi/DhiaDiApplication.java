package com.dhia.dhiadi;

import com.dhia.dhiadi.Controller.*;
import com.dhia.dhiadi.datasouce.FakeDataSource;
import com.dhia.dhiadi.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DhiaDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(DhiaDiApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		System.out.println(controller.sayHello());

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayhello());


		System.out.println("--------- Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.sayGreeting());

		System.out.println("----------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.sayGreeting());

		System.out.println("---------- data Source");
		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean("fakeDataSource");
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());

		SingletonBean singleton = ctx.getBean(SingletonBean.class);
		System.out.println(singleton.getMyScope());
	}

}

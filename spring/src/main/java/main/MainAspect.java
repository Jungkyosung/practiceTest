package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppCtx;
import spring.Calculator;
import spring.ImplCalculator;
import spring.RecuCalculator;

public class MainAspect {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		
		Calculator c1 = ctx.getBean("recuCalculator",RecuCalculator.class);
		System.out.println(c1.factorial(10));
		System.out.println(c1.factorial(10));
		System.out.println(c1.factorial(7));
		System.out.println(c1.factorial(7));
		System.out.println(c1.factorial(5));
//		System.out.println(c1.getClass().getName());
		
//		Calculator c = ctx.getBean("implCalculator",ImplCalculator.class);
//		System.out.println(c.factorial(10));
//		System.out.println(c.getClass().getName());
		
		
	}

}

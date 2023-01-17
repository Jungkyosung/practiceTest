package sample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		Greeter g1 = ctx.getBean("greeter", Greeter.class);
		Greeter g2 = ctx.getBean("greeter", Greeter.class);
		System.out.println(g1 == g2);
		
		ctx.close();
	}

}

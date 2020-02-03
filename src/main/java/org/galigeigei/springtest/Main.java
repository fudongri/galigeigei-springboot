package org.galigeigei.springtest;

import org.galigeigei.springtest.config.App;
import org.galigeigei.springtest.config.Z;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
		System.out.println("ctx========================");
		ctx.getBean(Z.class);
		ctx.getBean(Z.class);

		System.out.println("x-->" + ctx.getBean("x"));
	}

}

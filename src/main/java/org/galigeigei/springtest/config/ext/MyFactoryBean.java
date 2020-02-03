package org.galigeigei.springtest.config.ext;

import org.galigeigei.springtest.config.Z;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyFactoryBean implements FactoryBean<Z> {

	public MyFactoryBean() {
		System.out.println("MyFactoryBean construct..");
	}

	@Override
	public Z getObject() throws Exception {
		return new Z();
	}

	@Override
	public Class<?> getObjectType() {
		return Z.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}

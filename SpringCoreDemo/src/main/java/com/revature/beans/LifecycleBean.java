package com.revature.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")//Singleton would also be fine
public class LifecycleBean implements DisposableBean, InitializingBean {

	public LifecycleBean() {
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("after properties set");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
	}
	
	public void defaultInit(){ 
		System.out.println("custom destroy method");
		
	}
	
	public void defaultDestroy() {
		System.out.println("custom destroy");
	}

		

}

package com.mindfire.intern.reviewapp.build;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindfire.intern.reviewapp.configuration.ReviewAppDataConfiguration;

/**
 * 
 */

/**
 * @author Ashutosh Dash
 *
 */
public class BuildContext {
	
	private static ApplicationContext context;
	private static AutowireCapableBeanFactory factory;
	
	static {
		context = new AnnotationConfigApplicationContext(ReviewAppDataConfiguration.class);
		factory = context.getAutowireCapableBeanFactory();
	}
	
	public static ApplicationContext get() {
		return context;
	}
	
	public static <T> T registerBean(Class<T> clazz) {
		BeanDefinitionRegistry registry = (BeanDefinitionRegistry) factory;
		
		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
		beanDefinition.setBeanClass(clazz);
		beanDefinition.setAutowireCandidate(true);
		
		registry.registerBeanDefinition(getBeanName(clazz), beanDefinition);
		factory.autowireBeanProperties(clazz,
				AutowireCapableBeanFactory.AUTOWIRE_BY_TYPE, false);
		return context.getBean(clazz);
	}
	
	private static String getBeanName (Class<?> clazz) {
		
		String classname = clazz.getSimpleName();
		StringBuilder nameBuilder = new StringBuilder(classname);
		nameBuilder.setCharAt(0, Character.toLowerCase(classname.charAt(0)));
		return nameBuilder.toString();
		
	}

}

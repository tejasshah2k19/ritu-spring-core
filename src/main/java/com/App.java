package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.controller.UserController;
import com.dao.UserDao;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

//    	UserDao userDao = new UserDao();

		// spring.xml -> UserDao -> ioc container -> get

		// BeanFactory
		// ApplicationContext

//    	ApplicationContext -> interface

		// ClassPathXmlApplicationContext
//		FileSystemXmlApplicationContext

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println(context);

		UserDao userDao1 = context.getBean("userDao", UserDao.class);
		UserDao userDao2 = (UserDao) context.getBean("userDao");

		System.out.println(userDao1);
		System.out.println(userDao2);

		UserController userController = context.getBean("userController", UserController.class);

		System.out.println(userController);
		System.out.println(userController.userDao);
		System.out.println(userController.getAdminDao());
		System.out.println(userController.getAdminDao().getUserName());
		
		System.out.println(userController.stateDao);
		
	}
}

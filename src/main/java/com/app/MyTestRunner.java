package com.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyTestRunner implements CommandLineRunner {
	public void run(String...args)throws Exception
	{
		System.out.println("---from MyTestRunner---");
	}
	public int getOrder()
	{
		return 55;
	}

}

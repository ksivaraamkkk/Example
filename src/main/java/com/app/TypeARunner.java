package com.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(66)
public class TypeARunner implements CommandLineRunner{
public void run(String...args)throws Exception
{
	System.out.println("from SIVA KARNAGUNTA");
}
}

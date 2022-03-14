package com.seliniumexpress.ioc;

public class Vodaphone implements sim{

	@Override
	public void calling() {
		System.out.println("calling using vodaphone mobile");
		
	}

	@Override
	public void data() {
		
		System.out.println("browsinhg and using vodaphone internet");
	}

}
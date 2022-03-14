package com.seliniumexpress.ioc;

public class Airtel implements sim{

	@Override
	public void calling() {
		System.out.println("calling using airtel mobile");
		
	}

	@Override
	public void data() {
		
		System.out.println("browsinhg and using airtel internet");
	}

}

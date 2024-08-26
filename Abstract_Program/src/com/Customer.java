package com;

public class Customer extends Amazon {

	@Override

	void buy(String product) {

		System.out.println("Buying "+product);
	}

	@Override
	void pay(int amount) {

		System.out.println("Paying "+amount);

	}

	public static void main(String[] args) {
		
		
		Customer c = new  Customer();
		
		c.buy("Laptop");
		
		c.pay(740000);
		
	}

}

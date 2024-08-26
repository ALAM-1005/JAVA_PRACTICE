package org;

class Tom extends Employee{
	
	@Override
	
	 void work(){
		System.out.println("Employee is Working ");
	}
	@Override
	void walk() {
		
		System.out.println("Person is walking anywhere");
	}
	@Override
	void eat() {
		
		System.out.println("person ism Eating Biryani");
	}
	
	public static void main(String[] args) {
		
		
		
		Tom t =  new Tom();
		
		t.eat();
		t.walk();
		t.work();
		
	}

}

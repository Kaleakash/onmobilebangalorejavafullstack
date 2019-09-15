package com;

import java.util.Optional;

class Abc {
	void dis() {
		System.out.println("method");
	}
	
	public void receiveObject(Object obj) {
		
	}
}
public class OptionDemo {

	public static void main(String[] args) {
	Abc obj = new Abc();
	//Optional<Abc> op1 =  Optional.of(obj);
	//obj.dis();
	//System.out.println(op1.isPresent());
	
	Optional<Abc> op = Optional.ofNullable(obj);
	
	if(op.isPresent()) {
		System.out.println("Yes");
		obj.dis();
	}else {
		System.out.println("No");
		System.out.println("object not created...");
	}
	}

}

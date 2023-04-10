package com.demo;

class Whatsapp1 implements MessageService {

	public void message() {
		System.out.println("hi");
	}
}

class Fb implements MessageService {
	
		public void message() {
			System.out.println("hello");
		}
	}

	public class Whatsapp {
	

	public  static void main(String[] args) {
		MessageService m;
		m = new Whatsapp1();
		m.message();
		m = new Fb();
		m.message();

	}

}


package com.demo;

 class Car1 implements Movable {
	 public void move()
	 {
		 
		System.out.println("car is moving with speed "+speed);
	 }

}
class Ball implements Movable {


	@Override
	public void move() {
		
		System.out.println("ball is rolling at speed"+speed);
		
	}
}

public class Car{
	public static void main(String args[])
	{
		Movable m;
		m= new Car1();
		m.move();
		
		m=new Ball();
		m.move();
	}
}

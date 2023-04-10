package com.hierarchical1;

class player{
	void display() {
		System.out.println("i am a player");
	}
	
}
class hockeyPlayer extends player
{
	void display() {
		System.out.println("i am a hockey player");
	}
}
class footballPlayer extends player{
	void display() {
		System.out.println("i am a football player");
	}
}



public class dynamicMethod {

	public static void main(String[] args) {
		player p1;
		p1=new hockeyPlayer();
		p1.display();
		p1= new footballPlayer();
		p1.display();
		
		
		

	}

}

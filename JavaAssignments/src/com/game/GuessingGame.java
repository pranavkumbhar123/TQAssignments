package com.game;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		int answer=(int)(Math.random()*100)+1;
		int n=5;
		Scanner sc=new Scanner(System.in);
		boolean correct=false;
		System.out.println("I am thinking the number between 1 and 100. \n you have 5 tries to guess the number");
		while(n>0) {
			System.out.println("Enter a guess:");
			int guess=sc.nextInt();
			if(guess==answer) {
				System.out.println("you guessed the number,win");
				break;
			}
			else if(guess>answer) {
				System.out.println("your guess is to high.\n you have"+(n-1)+"tries left");
				n--;
				
			}
			else {
				System.out.println("your guess is to low.\n you have"+(n-1)+"tries left");
				
			}
			n--;
		}
		if(correct==false) {
			System.out.println("tries are over.\n you lose the game, Better luck next time!");
		}
	}

}

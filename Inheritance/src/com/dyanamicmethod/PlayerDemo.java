package com.dyanamicmethod;

class Player {
	protected String name;

	Player() {

	}

	Player(String name) {
		this.name = name;
	}

	void playerType() {
		System.out.println(name + "is a player");
	}
}
	class CricketPlayer extends Player {
		public CricketPlayer() {

		}

		public CricketPlayer(String name) {
			super(name);
		}

		void playerType() {
			System.out.println(name + " is a cricket player");
		}
	}

	class FootBallPlayer extends Player {
		public FootBallPlayer() {

		}

		public FootBallPlayer(String name) {
			super(name);
		}

		void playerType() {
			System.out.println(name + " is a football player");
		}
	
}

public class PlayerDemo {

	public static void main(String[] args) {
		Player p;
		p = new CricketPlayer("pranav");
		p.playerType();

		p = new FootBallPlayer("nilesh");
		p.playerType();

	}

}

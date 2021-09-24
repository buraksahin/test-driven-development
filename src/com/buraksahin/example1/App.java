package com.buraksahin.example1;
public class App {
	
	public static void main(String args[]) {
		PlayerManager playerManager = new PlayerManager();
		playerManager.addPlayer(null);
		System.out.println("Started..");
		System.out.printf("Total Player Count %d", playerManager.getPlayerCount());
	}
}

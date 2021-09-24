package com.buraksahin.example1;
import java.util.ArrayList;
import java.util.List;

public class PlayerManager {
	List<Player> players;
	
	public PlayerManager() {
		players = new ArrayList<Player>();
	}
	
	public int getPlayerCount() {
		return players != null ? players.size() : 0;
	}

	public void addPlayer(Player player) {
		if(player != null) {
			players.add(player);
		}
	}
}

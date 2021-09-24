// All tests had been written before creating classes
// Developer have to be thinking as program user when writing tests
// So all test steps will be tested and developer won't be write unused codes
// And find questions to answers (programming by intention)
// TDD reverse all development line
//
// ADD TEST --> WRITE CODE --> REFACTORING, DESIGN
//	^				^						|
//  |_______________|_______________________|
//
// Program will be completely tested
//

package com.buraksahin.example1;
import org.junit.jupiter.api.BeforeEach;

import junit.framework.TestCase;

class Test extends TestCase{
	
	PlayerManager playerManager = null;
	Player nullPlayer = null;
	Player player = null;
	
	@BeforeEach
	protected void setUp() throws Exception {
		playerManager = new PlayerManager();
		player = new Player("buraksahin");		
	}
	
	@org.junit.jupiter.api.Test
	public void testPlayerZero() {
		assertEquals("Total player count is not 0", 0, playerManager.getPlayerCount());
	}
	
	@org.junit.jupiter.api.Test
	public void testAddOnePlayerToList() {
		playerManager.addPlayer(player);
		assertEquals("Total player count is not 1", 1, playerManager.getPlayerCount());
	}
	
	@org.junit.jupiter.api.Test
	public void testAddOneNullPlayerToList() {
		playerManager.addPlayer(nullPlayer);
		assertEquals("Total player count is not 0. Null player has been added.", 0, playerManager.getPlayerCount());
	}
}

package bowling;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pedago
 */
public class MutiPlayerGameTest {
    
    private MultiPlayersGame game;
    String[] testname={"Roger","Bastien","Mickael"};

	@Before
	public void setUp() {
            
		game = new MultiPlayersGame();
	}
        
        @Test
        public void CorrectName(){
            game.startNewGame(testname);
            assertEquals(testname[1],game.player[1]);
            }
        
        }
    


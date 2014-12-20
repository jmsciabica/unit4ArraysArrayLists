import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @gcschmit
 * @version 19 July 2014
 */
public class RadarTest
{
    /**
     * Default constructor for test class GameOfLifeTest
     */
    public RadarTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInitialState() throws Exception
    {
        final int ROWS = 100;
        final int COLS = 100;
        
        int startX = 2;
        int startY = 3;
        int dx = 1;
        int dy = 1; 
        
        double expectedVelocity = ((double)dy)/ dx;
        
        int ax = startX;
        int ay = startY;
        
        Radar radar = new Radar(ROWS, COLS, dx, dy, startX, startY);
        radar.setNoiseFraction(0.01);
        radar.scan();
        radar.updateAccumulator();
        
        for (int i = 0; i < 40; i++)
        {
            ax = ax+dx;
            ay = ay+dy;
            if(ax < ROWS && ay < COLS && ax > 0 && ay > 0)
            {
                radar.scan();
            }
        }
        
        System.out.print(radar.getMonsterVelocity());
    }

    @Test
    public void testFinalState()
    {

    }
}


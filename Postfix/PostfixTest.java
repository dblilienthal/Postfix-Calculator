

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PostfixTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PostfixTest
{
    /**
     * Default constructor for test class PostfixTest
     */
    public PostfixTest()
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
    public void classTest()
    {
        Postfix p = new Postfix("2 3 +");
        //p.eval();
        assertEquals(5.0, (double)p.eval(), 0.0001);
    }
    
    @Test
    public void testEval()
    {
        Postfix a = new Postfix("4");
        assertEquals(4.0, (double)a.eval(), 0.0001);
        
        Postfix b = new Postfix("1 2 +");
        assertEquals(3.0, (double)b.eval(), 0.0001);
        
        Postfix c = new Postfix("1 2 + 3 +");
        assertEquals(6.0, (double)c.eval(), 0.0001);
        
        Postfix d = new Postfix("1 2 - 3 4 - - ");
        assertEquals(0.0, (double)d.eval(), 0.0001);
        
        //add your own tests. At least one per operator and mix them 
        //around as well
        
        
    }
    
    @Test
    public void testMult()
    {
        Postfix a = new Postfix("1 2 *");
        assertEquals(2.0, (double)a.eval(), 0.0001);
        
        Postfix b = new Postfix("1 2 3 * *");
        assertEquals(6.0, (double)b.eval(), 0.0001);
        
        Postfix c = new Postfix("15 2 3 * *");
        assertEquals(90.0, (double)c.eval(), 0.0001);
    }
    
    @Test
    public void testDivision()
    {
        Postfix a = new Postfix("2 1 /");
        assertEquals(2.0, (double)a.eval(), 0.0001);
        
        Postfix b = new Postfix("2 40 /");
        assertEquals(0.05, (double)b.eval(), 0.0001);
    }
    
    @Test
    public void testExponent()
    {
        Postfix a = new Postfix("2 2 ^ ");
        assertEquals(4.0, (double)a.eval(), 0.0001);
        
        Postfix b = new Postfix("2 3 ^ ");
        assertEquals(9.0, (double)b.eval(), 0.0001);
        
        Postfix c = new Postfix("3 2 ^ ");
        assertEquals(8.0, (double)c.eval(), 0.0001);
    }
    
    @Test
    public void testSqrt()
    {
        Postfix a = new Postfix("4 sqrt ");
        assertEquals(2.0, (double)a.eval(), 0.0001);
        
        Postfix b = new Postfix("9 sqrt");
        assertEquals(3.0, (double)b.eval(), 0.0001);
        
        Postfix c = new Postfix("10 sqrt");
        assertEquals(3.0, (double)c.eval(), 1.000);
        // i set the acceptable range to 1 
    }
    
    @Test
    public void testDup()
    {
        Postfix a = new Postfix("2 dup +");
        assertEquals(4.0, (double)a.eval(), 0.0001);
        
        Postfix b = new Postfix("2 dup dup + + ");
        assertEquals(6.0, (double)b.eval(), 0.0001);
        
        Postfix c = new Postfix("10 dup 30 + +");
        assertEquals(50.0, (double)c.eval(), 0.0001);
    }
    
    @Test
    public void testSwap()
    {
        Postfix b = new Postfix("9 81 /");
        assertEquals(1.0, (double) b.eval(), 1.0 );
        
        Postfix a = new Postfix("81 9 swap /");
        assertEquals(1.0, (double) a.eval(), 1.0001 );
    }
    
    @Test
    public void testRot()
    {
        Postfix a = new Postfix("1 2 3 rot - -");
        assertEquals(4.0, (double)a.eval(), 0.00001);
        
        Postfix b = new Postfix("2 3 1 rot - -");
        assertEquals(2.0, (double)b.eval(), 0.0001);
        
        Postfix c = new Postfix("30 2 1 rot - -");
        assertEquals(-27.0, (double)c.eval(), 0.0001);
    }
}

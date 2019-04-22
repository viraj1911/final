/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ca.sheridancollege.project.Card;
import ca.sheridancollege.project.Card_deck;
import ca.sheridancollege.project.Suits;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author viraj138
 */
public class SuitsTest {
    
    public SuitsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    
     @Test
    public void testValues() {
        System.out.println("Values");
        Suits[] expResult = null;
        Suits[] result = Suits.values();
        assertArrayEquals(expResult, result);
      
       
    }
    
     @Test
    public void testValueOf() {
        System.out.println("value Of");
        String arg0 = "";
        Suits expResult = null;
        Suits result = Suits.valueOf(arg0);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

}

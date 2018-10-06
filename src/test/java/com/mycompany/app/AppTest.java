package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestSuite;
import java.util.ArrayList;
import java.util.Arrays;
import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
   public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }


    /**
     * Rigourous Test :-)
     */
 public void testApp()
    {
        assertTrue( true );
    }
	  public void testFound() {
      ArrayList<String> array1= new ArrayList<>(Arrays.asList(a, b, c, d));
	  ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	  ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 3, 7, 4));
	  ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 6, 3, 9));
      assertTrue(new App().comp(array1, array2, array3, array4).equals("Total scores: a : 3 b : 11 c : 13 d : 17 Class average : 11.0"));
    }
/*
    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array, 5));
    }

    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(new App().search(array, 1));
    }

    public void testNull() {
      assertFalse(new App().search(null, 1));
    }
*/

}

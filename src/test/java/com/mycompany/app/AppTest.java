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
	  public void testAverage() {
      	ArrayList<String> array1= new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
	  	ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	  	ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 3, 7, 4));
	  	ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 6, 3, 9));
	  	String part = new App().comp(array1, array2, array3, array4); 
      	assertTrue(part.substring(part.length()-4).equals("11.0"));
    }
	public void testSumA() {
	  	ArrayList<String> array1= new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
	  	ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	  	ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 3, 7, 4));
	  	ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 6, 3, 9));
	  	String part = new App().comp(array1, array2, array3, array4); 
      	assertTrue(part.charAt(19) == '3');
    
	}
	public void testSumB() {
	  	ArrayList<String> array1= new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
	  	ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	  	ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 3, 7, 4));
	  	ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 6, 3, 9));
	  	String part = new App().comp(array1, array2, array3, array4); 
      	assertTrue(part.substring(25,27).equals("11"));
    
	}
	public void testSumC() {
	  	ArrayList<String> array1= new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
	  	ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	  	ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 3, 7, 4));
	  	ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 6, 3, 9));
	  	String part = new App().comp(array1, array2, array3, array4); 
      	assertTrue(part.substring(32,34).equals("13"));
	}
	public void testSumD() {
	  	ArrayList<String> array1= new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
	  	ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
	  	ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 3, 7, 4));
	  	ArrayList<Integer> array4 = new ArrayList<>(Arrays.asList(1, 6, 3, 9));
	  	String part = new App().comp(array1, array2, array3, array4); 
      	assertFalse(!part.substring(39,41).equals("17"));
	}

   public AppTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

 public void testApp()
    {
        assertTrue( true );
    }



}

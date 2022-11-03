/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestCases;

import com.mycompany.randomnumber.RandomNumber;
import static org.junit.Assert.assertEquals;
import org.testng.annotations.Test;

/**
 *
 * @author Khushbu Patel
 */
public class ProbabilityTestCases {
    RandomNumber randomnumber = new RandomNumber();
    

public ProbabilityTestCases() {
		super();
	}

    @Test
    public void testProbability_1()throws Exception{
        try {
       float P0= RandomNumber.rand25(50);
       System.out.println(P0);
       assertEquals(50.0<P0,true);
        }
    catch (Exception e) {
             System.out.println(e.getMessage());
            
        } 
    
}
     @Test
    public void testProbability_2()throws Exception{
        try {
       float P0= RandomNumber.rand25(55000);
       System.out.println(P0);
       assertEquals(74.0<=P0 && P0<76.0,true);
        }
    catch (Exception e) {
             System.out.println(e.getMessage());
            
        } 
    
}
    @Test
    public void testProbability_3()throws Exception{
        try {
       float P0= RandomNumber.rand25(1000000);
       System.out.println(P0);
       assertEquals(74.0<=P0 && P0<=75.0,true);
        }
    catch (Exception e) {
             System.out.println(e.getMessage());
            
        } 
    
}

    @Test
    public void testProbability_4()throws Exception{
        try {
       //int results = fractionoperation.Addition(20,4);
       float P0= RandomNumber.rand25(5090);
       System.out.println(P0);
       assertEquals(65.0<=P0 && P0<=76.0,true);
        }
    catch (Exception e) {
             System.out.println(e.getMessage());
            
        } 
    
}
    @Test
    public void testProbability_5()throws Exception{
        try {
       float P0= RandomNumber.rand25(40867);
       System.out.println(P0);
       assertEquals(55.0<=P0 && P0<=65.0,false);
        }
    catch (Exception e) {
             System.out.println(e.getMessage());
            
        } 
    
}
    @Test
    public void testProbability_6()throws Exception{
        try {
       float P0= RandomNumber.rand25(3567);
       System.out.println(P0);
       assertEquals(45.0<=P0 && P0<=65.0,false);
        }
    catch (Exception e) {
             System.out.println(e.getMessage());
            
        } 
    
}
    @Test
    public void testProbability_7()throws Exception{
        try {
       float P0= RandomNumber.rand25(3670);
       System.out.println(P0);
       assertEquals(35.0<=P0 && P0<=45.0,false);
        }
    catch (Exception e) {
             System.out.println(e.getMessage());
            
        } 
    
}
    @Test
    public void testProbability_8()throws Exception{
        try {
       float P0= RandomNumber.rand25(2657);
       System.out.println(P0);
       assertEquals(25.0<=P0 && P0<=35.0,false);
        }
    catch (Exception e) {
             System.out.println(e.getMessage());
            
        } 
}
   
}

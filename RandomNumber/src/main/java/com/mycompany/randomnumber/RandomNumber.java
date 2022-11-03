/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.randomnumber;


/**
 *
 * @author Khushbu Patel
 */
public class RandomNumber {
   
    static int rand50()
    {
        return (int) (10 * Math.random()) & 1;
    }
 
    
   public static float rand25(int num)
    {
        float zerocounter = 0;
        float onecounter = 0;
        for (int i = 0; i < num; i++)
        {
            int number= rand50() & rand50();
           // System.out.print(number);
            if(number== 0){
                zerocounter++;    
            }
            else{
                onecounter++;    
            }  
        }
       float totalNum = num;
      
           System.out.print("One counter:"+onecounter+"\n");
           System.out.print("Zero counter:"+zerocounter+"\n");
           float P0=(zerocounter/totalNum)*100;
           System.out.print("probability of 0:"+P0+"\n");
       return P0;
    }

}

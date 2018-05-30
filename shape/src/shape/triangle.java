package shape;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lion's Life
 */
public class triangle {
    public void cal()
    {
        
       double l=10,b=50,area;
       System.out.println("enter l and b");
       Scanner s=new Scanner(System.in);
       area=0.5*l*b;
       System.out.println("triangle"+area);
      
    }
    
}

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
public class circle {
    public void cal()
    {
        double r,area;
        r=10;
        area=0;
        System.out.println("enter r");
        Scanner s=new Scanner(System.in);
        area=3.142*r*r;
        System.out.println("area"+area);
    }
    
}


import shape.circle;
import shape.triangle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Lion's Life
 */
public class Shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("shape");
       circle c=new circle();
       c.cal();
       triangle t=new triangle();
       t.cal();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s119;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S119 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner sc = new Scanner (System.in);
   float x=sc.nextFloat ();

  if (x >= 0 && x <= 25) {
    System.out.println("Interval [0,25]");
} else if (x > 25 && x <= 50) {
    System.out.println("Interval (25,50]");
} else if (x > 50 && x <= 75) {
    System.out.println("Interval (50,75]");
} else if (x > 75 && x <= 100) {
    System.out.println("Interval (75,100]");
} else {
    System.out.println("Out of Intervals");
}
    
    
    
    
    }
    
}

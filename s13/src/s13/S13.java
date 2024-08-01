/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s13;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner sc = new Scanner (System.in);
     long x = sc.nextInt();
     long y = sc.nextInt();
      System.out.println(x + " + " + y + " = "  + (x + y));
    
       System.out.println(x + " * " + y + " = "  + (x * y));
    
       System.out.println(x + " - " + y + " = "  + (x - y));
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s18;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    Scanner sc = new Scanner (System.in);    
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    double res=a/b;
    System.out.println("floor " + (int)a +" / "+ (int)b+" = "+(int)Math.floor(res));
     System.out.println("ceil "+ (int)a+" / "+ (int)b+" = "+ (int)Math.ceil(res));
     System.out.println("round "+ (int)a+" / "+ (int)b+" = "+ (int)Math.round(res));
    
    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s14;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner (System.in);
    long A=sc.nextLong();
    long B=sc.nextLong();
   long C=sc.nextLong();
    long D=sc.nextLong();
     System.out.println("Difference = "+ ((A*B)-(C*D)));
    }
    
}

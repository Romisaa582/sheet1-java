/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s15;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner sc = new Scanner (System.in);
    double r = sc.nextDouble();
    double result = r * r *Math.PI;
    System.out.printf("%.9f",result);
    System.out.println();
    
    }
    
}

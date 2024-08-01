/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s16;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner sc = new Scanner (System.in);    
    
  long n = sc.nextLong();
  long m = sc.nextLong();
  long lastn = n%10;
  long lastm = m%10;
  long result = lastn+lastm;
  System.out.println(result);
    
    
    }
    
}

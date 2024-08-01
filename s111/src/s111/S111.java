/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s111;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner sc = new Scanner (System.in);
   int a = sc.nextInt();
   int b = sc.nextInt();
   int c = sc.nextInt();
   System.out.println(Math.min(a, Math.min(b, c))+ "    " +Math.max(a,Math.max(b, c)) );
    
    
    
    
    
    }
    
}

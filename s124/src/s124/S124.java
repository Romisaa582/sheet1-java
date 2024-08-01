/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s124;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S124 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
 
  
  Scanner input = new Scanner(System.in);
  int l1,r1,l2,r2,x,y;
  l1 = input.nextInt();
  r1 = input.nextInt();
  l2 = input.nextInt();
  r2 = input.nextInt();
  
    x=Math.max(l1, l2);
    y=Math.min(r1, r2);
 
    if (x<=y) {
        System.out.println(x + " " + y);
    } else {
        System.out.println(-1);
    }
    input.close();
  }
}

    
    
    
    
    
    
    
    
   
    


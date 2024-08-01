/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s19;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner sc = new Scanner (System.in);
   byte a=sc.nextByte();
   byte b=sc.nextByte();
   if(a>=b){
       System.out.println("Yes");
   
    
   }else { 
    
        System.out.println("No");
   }
    
    
    }
    
}

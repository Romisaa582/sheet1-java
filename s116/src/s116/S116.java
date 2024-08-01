/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s116;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S116 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner sc = new Scanner (System.in);
   short a=sc.nextShort();
   int firstDigit=0;
   while(a!=0){
       firstDigit=a%10;
       a/=10;
   }
   
   if(firstDigit%2==0){
     System.out.println("EVEN");
   }else{
      System.out.println("ODD");  
       
   }
    
    
    
    
    
    }
    
}

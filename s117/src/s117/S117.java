/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s117;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S117 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner (System.in);
    float x=sc.nextFloat();
    float y=sc.nextFloat();
    if (x>0 && y>0){
        System.out.println("Q1");
    }
    else if(x<0 && y>0){
         System.out.println("Q2");  
    }
     else if(x<0 && y<0){
             System.out.println("Q3");  
     }
    else if(x>0 && y<0){
             System.out.println("Q4");
    
    }
   else if(x!=0 && y==0){
             System.out.println("Eixo X");
    
   }
    else if(x==0 && y!=0){
             System.out.println("Eixo Y");
     
    
    }else {
    
    System.out.println("Origem");
    }
    } 
    
}

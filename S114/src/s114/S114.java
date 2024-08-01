/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s114;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner sc = new Scanner (System.in);
    char x=sc.next().charAt(0);
    if (x>='A'&&x<='Z'){
        x+=32;
        System.out.println(x);
            
    }else{
        x-=32;
        System.out.println(x);        
    }      
       
            
           
    
    
    
    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s123;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class S123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    char sign = sc.next().charAt(0);
    int y = sc.nextInt();
    char eql = sc.next().charAt(0);
    int res=sc.nextInt();
    int result=0;
    switch(sign) {
        case '+':
            result =x+y;
            if(res==result){
              System.out.println("Yes");
            }else{    
            
             System.out.println(result);   
            }
           case '-':
            result =x-y;
            if(res==result){
              System.out.println("Yes");
            }else{    
            
             System.out.println(result);    
    }
    
     case '*':
            result =x*y;
            if(res==result){
              System.out.println("Yes");
            }else{    
            
             System.out.println(result);
    
            }
    
    }
           
    }   
}

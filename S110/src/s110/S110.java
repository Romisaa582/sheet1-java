/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s110;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S110 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner sc = new Scanner (System.in);
int a=sc.nextInt();
int b=sc.nextInt();
if(a%b==0 || b%a==0){
    System.out.println("Multiples");
}else{
    System.out.println("No Multiples");
}
    
    
    
    
    }
    
}

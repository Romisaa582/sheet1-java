/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s126;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S126 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
  Scanner input = new Scanner(System.in);
  double num1,num2,num3,num4;
  num1 = input.nextDouble();
  num2 = input.nextDouble();
  num3 = input.nextDouble();
  num4 = input.nextDouble();
 
    if((num2*Math.log(num1)) > (num4*Math.log(num3))){
    System.out.println("YES");
  } else {
    System.out.println("NO");
  }
  input.close();
  }
}
    
    
    
    
    
 

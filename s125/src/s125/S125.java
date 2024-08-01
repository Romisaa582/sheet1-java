/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s125;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S125 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
  Scanner input = new Scanner(System.in);
  int a,b,c,d,res=0;
  a = input.nextInt();
  b = input.nextInt();
  c = input.nextInt();
  d = input.nextInt();
  res = ((a%100) * (b%100) * (c%100) * (d%100));
 
    if(res % 100 <= 9){
    System.out.println("0" + res %100);
  } else {
    System.out.println(res % 100);
  } 
  input.close();
  }
}
    
    
    
    
    
  

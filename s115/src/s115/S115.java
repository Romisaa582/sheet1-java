/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s115;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S115 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
    Scanner input = new Scanner(System.in);
    String str = input.next();
    if (str.contains("+")){
        int num1 = Integer.parseInt(str.substring(0, str.indexOf("+")))  , num2 = Integer.parseInt(str.substring(str.indexOf("+")+1));
        System.out.println(num1+num2);
    } else if (str.contains("-")){
        int num1 = Integer.parseInt(str.substring(0, str.indexOf("-")))  , num2 = Integer.parseInt(str.substring(str.indexOf("-")+1));
        System.out.println(num1-num2);
    } else if (str.contains("*")){
        int num1 = Integer.parseInt(str.substring(0, str.indexOf("*")))  , num2 = Integer.parseInt(str.substring(str.indexOf("*")+1));
        System.out.println(num1*num2);
    }else {
        int num1 = Integer.parseInt(str.substring(0, str.indexOf("/")))  , num2 = Integer.parseInt(str.substring(str.indexOf("/")+1));
        System.out.println(num1/num2);
    }
    input.close();
  }
}

    
    
    
    
    
  
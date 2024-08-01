/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s113;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner (System.in);
    char X=sc.next().charAt(0);
    if(X>64&&X<91){
  System.out.println("ALPHA");
    System.out.println("IS CAPITAL"); 
    }else if (X>96&&X<123){
      System.out.println("ALPHA");
    System.out.println("IS SMALL");
    }else if(X>47&&X<58){
    
    System.out.println("IS DIGIT");
    }
    
}}

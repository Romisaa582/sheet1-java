/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s112;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  Scanner sc = new Scanner (System.in);
 String fName1=sc.next();
  String lName1=sc.next();  
    String fName2=sc.next();
    String lName2=sc.next();
    if (lName1.equals(lName2)){
     System.out.println("ARE BROTHERS");
    }  else{
            System.out.println("NOT");  
             
             }
    }
    
    }
    

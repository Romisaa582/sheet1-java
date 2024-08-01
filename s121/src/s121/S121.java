/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s121;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner (System.in) ;
float n=sc.nextFloat ();
int ifint=(int)n;
if ( n - ifint > 0){
System.out.println("float " + ifint + " " + (n-ifint));
    } else {
    System.out.println("int" + ifint);
}}}
    
    
    
    

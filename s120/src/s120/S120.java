/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s120;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S120 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner sc = new Scanner (System.in) ; 
  int x = sc.nextInt();
int y = sc.nextInt();
int z = sc.nextInt ();  
    
    if (x <= y && x <=z) {
if (y < z) {
System.out.print(x + "\n" + y + "\n" + z+"\n");
}else{
System.out.print(x + "\n" + z + "\n" + y+"\n");
}
} else if (y <= x && y <= z) {
if (x <= z) {
System.out.print(y + "\n" + x + "\n" + z+"\n");
} else{

System.out.print(y + "\n" + z + "\n" + x+"\n"); 
}
    
    }

System.out.println();
System.out.print(x + "\n" + y + "\n" + z+"\n");

        }}




    
  


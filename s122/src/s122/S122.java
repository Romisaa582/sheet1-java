/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s122;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    int x=sc.nextInt();
    char c=sc.next().charAt(0);
    int y=sc.nextInt();
    switch(c){
        case'>':
            if (x>y){
                System.out.println("Right");
            }else{
                System.out.println("Wrong");
           
       }
            break;
    case'<':
            if (x<y){
                System.out.println("Right");
            }else{
                System.out.println("Wrong");
    }
    break;
     case'=':
            if (x==y){
                System.out.println("Right");
            }else{
                System.out.println("Wrong");
  
            }
    break;
    
}
    }}
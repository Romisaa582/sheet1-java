/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s118;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class S118 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner sc = new Scanner (System.in);
int year=365;
int month=30;
int ageInYear,ageInDay,ageInMonth;
int n=sc.nextInt();
ageInYear=n/year; 
    n%=year;
ageInMonth=n/month;
ageInDay=n%month;
System.out.println(ageInYear+" Years");
System.out.println(ageInMonth+" months");
System.out.println(ageInDay+" days");
    
    
    }
    
}

/*Write a program to convert USD2INR and INR2USD */
import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for US to INR\nenter 2 for INR to US");
        int n = sc.nextInt();
        final double us = 82.97 ;
        if(n==1){
            System.out.print("enter US doller : ");
            double m = sc.nextDouble();
            System.out.println("$"+m+"="+"Rs"+m*us);
        }
        else if(n==2){
            System.out.print("enter INR : ");
            double m = sc.nextDouble();
            System.out.println("Rs"+m+"="+"$"+m/us);
        }
        else{
            System.out.println("enter valid choise");
        }

    }
    
}

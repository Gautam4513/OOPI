/* Write a program to convert binary to decimal and decimal to binary. */
import java.util.*;
public class p3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int i;
        int remainder;
        System.out.print("enter 1 for decimal to binary\nenter 2 for binary to decimal\n");
        int x=sc.nextInt();
        if (x==1){
            System.out.print("enter the decimal number : ");
            n=sc.nextInt();
            i=1;
            int binaryNumber=0;
            while(n!=0){
                remainder=n%2;
                n=n/2;
                binaryNumber=binaryNumber+(remainder*i);
                i=i*10;
            }
            System.out.print("binary is : "+ binaryNumber);
            
        }
        else if(x==2){
            System.out.print("enter binary number : ");
            n=sc.nextInt();
            i=0;
            int decimal=0;
            while(n!=0){
                remainder=n%10;
                n=n/10;
                decimal=(int) (decimal + (remainder * (Math.pow(2,i))));
                i++;
            }
            System.out.println(decimal);
        }
        else{
            System.out.println("enter a valid choise");
        }
    }
}

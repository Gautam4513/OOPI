/* Write a program to validate email address */
import java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a valid email address: ");
        String email = sc.next();
       int c=0; // c is 0 when no. of error is 0 ather wise it becom 1
       int i=0; // it is a index of email string
       int d=0; // it count the number of digits
       if(!(email.substring(email.indexOf('@'), email.length())).contains(".")){
        System.out.println("error: plese enter '.' ");
        c=1;
       }
       if(email.contains("@")){
        while(email.charAt(i) != '@'){
            char ch = email.charAt(i); // store the i index character
            if(Character.isDigit(email.charAt(0))){
                System.out.println("please don't start email with digit");
                c=1;
                break;
            }
            else if(Character.isUpperCase(ch)){
                System.out.println("Upper case is not allowed");
                c=1;
                break;
            }
            else if(!(Character.isLetterOrDigit(ch))){
                System.out.println("please enter only leters and digits");
                c=1;
                break;
            }
            if(Character.isDigit(ch)){
                d++;
            }
            i++;
        }
        if(c==0){
            if(d==0){
                System.out.println("please enter any digit not only leters");
            }
            else{
                System.out.println("your email is valid  "+email);
            }
        }
       }
       else{
        System.out.println("please enter @ sign ");
       }
    }
}

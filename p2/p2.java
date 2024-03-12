/* Write a program to validate GTU enrollno */
import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the enroll number: ");
        String enroll = sc.next();
        int flag=0;
        for (int i=0;i<enroll.length();i++){
            if(!(Character.isDigit(enroll.charAt(i)))){
                System.out.println("error: enter only digit");
                flag=1;
                break;
            }
        }
        if(enroll.length()!=12){
            System.out.println("error: yor enroll length is not valid");
            flag=1;
        }
        if(flag==0){
            System.out.println("your email is valid");
        }
    }
}

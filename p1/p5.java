/* Write a program to list a number divisible by n between n1 and n2 range */
import java.util.*;
public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,n1,n2;
        System.out.print("enter the range\n");
        n1= sc.nextInt();
        System.out.println("to");
        n2 = sc.nextInt();
        System.out.print("enter the divider number: ");
        n = sc.nextInt();
        for(int i=n1;i<=n2;i++){
            if((i%n)==0){
                System.out.print(i+" ");
            }
        }
    }
}

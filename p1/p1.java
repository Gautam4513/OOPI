/* Write a program to display first n prime numbers */
import java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n: ");
        int n = sc.nextInt();
        int a=2;
        int i=1;
        while(i<=n){
            int m=0;
            for(int j=2;j<a;j++){
                if(a%j==0){
                    m=1;
                    break;
                }
            }
            if(m==0){
                System.out.print(a + " ");
                i++;
            }
            a++;
        }
    }
    
}

/* Write a program to implement basic calculator */
import java.util.*;
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first value a: ");
        int a = sc.nextInt();
        System.out.print("enter second value b: ");
        int b = sc.nextInt();
        System.out.println("menu\n 1=addition(+)\n 2=subtracation(-)\n 3=division(/)\n 4=multiplication(*)\n 5=modulo(%)");
        int n=sc.nextInt();
        switch (n){
            case 1: System.out.println(a+"+"+b+"="+""+(a+b));
                    break;
            case 2:System.out.println(a+"-"+b+"="+""+(a-b));
            break;
            case 3:System.out.println(a+"/"+b+"="+""+(a/b));
            break;
            case 4:System.out.println(a+"*"+b+"="+""+(a*b));
            break;
            case 5:System.out.println(a+"%"+b+"="+""+(a%b));
            break;
            default: System.out.println("enter a valid choise");
            
        }
        
    }
}

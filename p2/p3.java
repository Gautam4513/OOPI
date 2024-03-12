/*Write a program to check given Strings are anagram or not */
import java.util.*;
public class p3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the first string: ");
        String s1 = sc.next(); // String 1
        System.out.print("enter the second string: ");
        String s2 = sc.next(); //String 2
        int a=0; //if a=0 તો strings are anagram 
        if(s1.length() == s2.length() ){
            for(int i=0;i<s1.length();i++){
               
                if(s2.contains(Character.toString(s1.charAt(i)))){//use "Character.toString(ch)" function
                    
                }
                else{
                    System.out.println("both Strings are not anagram");
                    a=1;
                    break;
                }
                
            }
            if(a==0){
                System.out.println("both string are anagram");
            }
        }
        else{
            System.out.println("both Strings are not equal \nso both strings are not anagram");
        }
    }
}

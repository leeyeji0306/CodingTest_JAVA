import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer="";
        String a = sc.next();
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)<='Z') answer+=(char)(a.charAt(i)+32);
            else answer+=(char)(a.charAt(i)-32);
        }
        
        System.out.print(answer);
    }
}
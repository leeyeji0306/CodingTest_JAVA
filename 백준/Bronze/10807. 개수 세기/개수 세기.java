import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] a=new int[num];
        int cnt=0;
        for(int i=0; i<num; i++){
            a[i]=sc.nextInt();
        }
        int need=sc.nextInt();
        for(int i=0; i<num; i++){
            if(a[i]==need) cnt++;
        }
        System.out.print(cnt);
    }
}
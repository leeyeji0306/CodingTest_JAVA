import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int max=-1000000, min=1000000;
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(max<a[i]) max=a[i];
            if(min>a[i]) min=a[i];
        }
        System.out.print(min+" "+max);
    }
}
import java.util.Scanner;
public class Main {
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		int n1, n2, tot;
		do{
			n1=sc.nextInt();
			n2=sc.nextInt();
			tot=n1+n2;
			if(tot==0) break;
			System.out.println(tot);
		}while(tot!=0);
	}
}	
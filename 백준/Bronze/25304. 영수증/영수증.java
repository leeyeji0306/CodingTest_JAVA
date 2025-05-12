import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int N=sc.nextInt(), num=0;
		String res;
		for(int i=1; i<=N; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			num+=(a*b);
		}
		if(X==num) {
			res="Yes";
		}
		else {
			res="No";
		}
		System.out.print(res);
	}
}
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt(), A, B;
		for(int i=T; i>=1; i--) {
			A=sc.nextInt();
			B=sc.nextInt();
			System.out.println(A+B);
		}
	}
}
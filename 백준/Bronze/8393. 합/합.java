import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), num=0;
		for(int i=n; i>=1; i--) {
			num+=i;
		}
		System.out.print(num);
	}
}
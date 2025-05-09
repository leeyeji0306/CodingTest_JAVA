import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int TestScore = sc.nextInt();
		char Grade;
		switch((int)(TestScore/10)) {
			case 9 : case 10 : Grade='A';break;
			case 8 : Grade='B';break;
			case 7 : Grade='C';break;
			case 6 : Grade='D';break;
			default : Grade='F';break;
		}
		System.out.print(Grade);
	}
}
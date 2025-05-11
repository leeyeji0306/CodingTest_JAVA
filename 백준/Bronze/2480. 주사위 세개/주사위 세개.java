import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt(), tot;
		if(num1==num2&&num1==num3) {			
			tot=10000+num1*1000;
		}
		else if(num1==num2 | num1==num3) {
			tot=1000+100*num1;
		}
		else if(num2==num3) {
			tot=1000+100*num2;
		}
		else if(num1>num2&&num1>num3) {
			tot=num1*100;
		}
		else if(num2>num3&&num2>num3) {
			tot=num2*100;
		}
		else {
			tot=num3*100;
		}
		System.out.print(tot);
	}
}
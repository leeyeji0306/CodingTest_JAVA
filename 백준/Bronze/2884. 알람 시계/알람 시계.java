import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		if(M>=45) {
			M-=45;
		}
		else if(H==0) {
			H=23;
			M=(60-(45-M));
		}
		else if(H>0){
			H-=1;
			M=(60-(45-M));
		}
		System.out.print(H+ " " + M);
	}
}
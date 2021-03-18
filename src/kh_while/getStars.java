import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int input=sc.nextInt();
		for(int i=0; i<input; i++) {
			for(int j=input-1; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}

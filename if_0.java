package vendingMachine.study;

import java.util.Scanner;

public class if_0 {
	public static int plus=0;
	static Scanner sc = new Scanner(System.in);
	public static int machine(int money) {
		
		System.out.println("얼마 충전하시겠습니까?");
		int a = Integer.parseInt(sc.nextLine());
		plus=a+money;
		
		return plus;
	}




public int getplus() {
	return plus;
}
}
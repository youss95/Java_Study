package vendingMachine.study;

import java.util.Scanner;

public class if_0 {
	public static int plus=0;
	static Scanner sc = new Scanner(System.in);
	public static int machine(int money) {
		
		System.out.println("¾ó¸¶ ÃæÀüÇÏ½Ã°Ú½À´Ï±î?");
		int a = Integer.parseInt(sc.nextLine());
		plus=a+money;
		
		return plus;
	}




public int getplus() {
	return plus;
}
}

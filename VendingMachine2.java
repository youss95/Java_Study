package vendingMachine.study;

import java.util.Scanner;



public class VendingMachine2 {

	public static void main(String[] args) {
		int money=3000;   //처음 소유 금액
		int coke=0;       // 구매한 콜라 갯수
		int cyder=0;      // 구매한 사이다 갯수
		int maesil=0;     // 구해한 매실차 갯수
		
		if_0 mm =new if_0();  
		
		Scanner sc = new Scanner(System.in);
		while(true) {

			System.out.println("=== 자판기 시뮬레이터 ===");
			System.out.println("1. 콜라(1000) 2. 사이다(800) 3.매실차(1500) [0.소지품확인]");
			System.out.println("음료를 선택하세요");
			int num = Integer.parseInt(sc.nextLine());
			if(num==1) {
				money-=1000;
				if(money<0) {
					System.out.println("더이상 구매할 돈이 없어요");
					
					mm.machine(money);  //충전 메소드
					money=mm.plus;
					System.out.println("현재 잔액은 "+ mm.plus +" 종료는 1번 계속하기는 0번" );
					String end = sc.nextLine();
					if(end.equals("1")) {
						break;
					} else {
						coke++;
						continue;
					}

				}

				System.out.println("콜라 +1");
				System.out.println("소지금 -1000");
				coke++;

			} else if(num==2) {
				money-=800;
				if(money<0) {
					System.out.println(" 더이상 구매할 돈이 없어요");
					
					mm.machine(money); //충전 메소드
					money=mm.plus;
					System.out.println("현재 잔액은 "+ mm.plus +" 종료는 1 계속하기 0");
					String end = sc.nextLine();
					if(end.equals("1")) {
						break;
					} else {
						cyder++;
						continue;
					}
				}

				System.out.println("사이다 +1");
				System.out.println("소지금 -800");
				cyder++;

			} else if(num==3) {
				money-=1500;
				if(money<0) {
					System.out.println("더이상 구매할 돈이 없어요");
					
					mm.machine(money);  //충전 메소드
					money=mm.plus;
					System.out.println("현재 잔액은 "+ mm.plus +" 종료는 1번 계속하기 0번" );
					String end = sc.nextLine();
					if(end.equals("1")) {
						break;
					} else {
						maesil++;
						continue;
					}
				} else if(money>=0) {
				System.out.println("매실차 +1");
				System.out.println("소지금 -1500");

				maesil++;
				}
			} else if(num==0) {
				System.out.println("=== 소지품 ===");
				System.out.println("남은돈: "+money);
				System.out.println("콜라"+coke+"개");
				System.out.println("사이다"+cyder+"개");
				System.out.println("매실차"+maesil+"개");

			}

		}
System.out.println("종료");
	}



}
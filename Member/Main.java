package main;

import java.util.Scanner;

import manager.Manager;

import vo.Gold;
import vo.Silver;

/*
멤버쉽 관리 시스템
회원정보 데이터
회원 아이디,이름,누적 보너스 포인트

1.신규정보입력
2.회원 목록 출력
3.포인트 추가
4.종료

 */
 
public class Main {

	public static void main(String[] args) {
		Manager m = new Manager();  //생성자 호출 한 순가 매니저 파일에서 멤버형 배열10짜리 만듬
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("회원관리시스템");
			System.out.println("1. 신규회원입력");
			System.out.println("2. 회원목록출력");
			System.out.println("3. 원하는 회원에 포인트 추가");
			System.out.println("4. 종료");
			System.out.println(">>>");
			int menu = Integer.parseInt(sc.nextLine());

			if(menu == 1) {
				System.out.print("id: ");
				String id =sc.nextLine();
				
				System.out.print("name: ");
				String name = sc.nextLine();
				
				System.out.print("point: ");
				int point = Integer.parseInt(sc.nextLine());
				
				System.out.println("1.실버회원 2.골드회원");
				System.out.print(">>> ");
				int n =Integer.parseInt(sc.nextLine());
				
				if(n==1) {
					m.add1(new Silver(id,name,point));
				} else {
					m.add1(new Gold(id,name,point));
				}
				
			} else if(menu==2) {

				m.printMembers();
			} else if(menu==3) {
			System.out.println("이름");
			String name = sc.nextLine();
				System.out.println("포인트 몇 점 추가");
				int j=Integer.parseInt(sc.nextLine());
				m.plus(name,j);
			} else {
				System.out.println("종료");
				break;
			}
		}

	}

}

package main;

import java.util.ArrayList;
import java.util.Scanner;

import manager.Manager;
import vo.Member;

public class Main {
	public static void main(String[] args) {
		Manager man = new Manager();

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("===학생관리 프로그램===");
			System.out.println("1. 신규 입력 (학번/이름/국/영/수)");
			System.out.println("2. 목록 출력  (학번/이름/국/영/수)");
			System.out.println("3. 목록 검색 (학번으로 검색, 이름으로 검색");
			System.out.println("4. 정보 삭제 (목록을 띄어주고 학번으로만 삭제)");
			System.out.println("5. 학생 정보 수정");
			System.out.println("7. 종료");
			int n=Integer.parseInt(sc.nextLine());

			if(n==1) {
				System.out.print("학번: ");
				String id=sc.nextLine();
				
				if(man.isIdExist(id)) {
					System.out.println("이미 존재하는 학번입니다.");
					continue;
				}
				
				System.out.print("이름: ");
				String name = sc.nextLine();
				System.out.print("국: ");
				int ko = Integer.parseInt(sc.nextLine());
				System.out.print("영: ");
				int en = Integer.parseInt(sc.nextLine());
				System.out.print("수: ");
				int math = Integer.parseInt(sc.nextLine());
				//위의 데이터를 따로 관리하는것은 너무 힘들다. 그래서 따로 클래스를 만들어 초기화 시키자
				Member mb= new Member(id,name,ko,en,math);
				man.add(mb);   //* 생성자호출 ->멤버 클래스로 가서

			} else if(n==2) {
				ArrayList<Member> members = man.getMembers();
				man.foreach(members);  //sysout출력 부분 메소드

			} else if(n==3) {
				System.out.println("1. 학번으로 검색 2. 이름으로 검색");
				int num = Integer.parseInt(sc.nextLine());
				if(num==1) {
					System.out.print("id: ");
					String id = sc.nextLine();
					man.searchId(id);
					
				} else if(num==2) {
					System.out.print("이름: ");
					String name = sc.nextLine();			
					ArrayList<Member> result= man.searchName(name);
				if(result.size()==0) {
					System.out.println("한 명도 없어요");
					continue;
				}
				man.foreach(result);
				}
				

			} else if(n==4) {

				ArrayList<Member> members = man.getMembers();
				man.foreach(members);  //출력 메소드
				System.out.print("삭제할 id: ");
				String id =sc.nextLine();
				man.deleteInfo(id);  
				System.out.println("id "+id+"이 삭제 되었습니다.");


			} else if(n==5) {
				ArrayList<Member> members = man.getMembers();
				man.foreach(members);  //출력 메소드
				System.out.print("업데이트 할 id: ");
				String id = sc.nextLine();
				
				System.out.print("이름 변경: ");
				String changeName = sc.nextLine();
				System.out.print("국어점수 변경: ");
				int changeKo=Integer.parseInt(sc.nextLine());
				System.out.print("영어점수 변경: ");
				int changeEn =Integer.parseInt(sc.nextLine());
				System.out.print("수학점수 변경: ");
				int changeMath = Integer.parseInt(sc.nextLine());
				man.updateById(id,changeName,changeKo,changeEn,changeMath);
			}

			else if(n==7) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}

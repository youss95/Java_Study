package student;

import java.util.Scanner;

public class FindData {
public static void main(String[] args) {
	Manager m = new Manager();  //매니저가 가지고 있는 모든 메소드를 상속받는다 //매니저란 가상공간이 만들어졌다 그리고 그 매니전 안에 학생을 가지고있다
	Scanner sc = new Scanner(System.in);
	while(true) {
	System.out.println("===학생관리 프로그램===");
	System.out.println("1.신규 정보 입력");
	System.out.println("2.학생 정보 출력");
	System.out.println("3.이름으로 정보 검색");
	System.out.println("4. 종료");
	int menu =Integer.parseInt(sc.nextLine());

	if(menu==1) {
		System.out.print("id: ");
		String id = sc.nextLine();
		
		System.out.print("name: ");
		String name =sc.nextLine();
		
		System.out.print("ko: ");
		int ko=Integer.parseInt(sc.nextLine());
		
		System.out.print("en: ");
		int en = Integer.parseInt(sc.nextLine());
		Student param = new Student(id,name,ko,en);
		m.addData(param);
		//m.add2(id, name, ko, en);
	}
	else if(menu==2) {
		m.printAll();
	} else if(menu==3) {
		System.out.println("학생성적 조회");
		String name =sc.nextLine();
	m.search(name);
	}
	else {
		System.out.println("종료");
		break;
	}
	
	}
}
}

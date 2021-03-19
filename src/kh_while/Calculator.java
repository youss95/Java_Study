package kh_while;
//계산기 프로그램
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double result =0;
		double n1=0;
		double n2=0;
		int cnt=1;
		while(true) {

			System.out.println("=== 계산기 프로그램 ====");
			System.out.println("연산자 입력(+,-,*,/)");
			String op = sc.nextLine();
			if(!op.equals("+")&&!op.equals("-")&&!op.equals("*")&&!op.equals("/")) {   //잘못입력 하면 다시실행
				System.out.println("잘못 입력하였습니다. 다시입력해 주세요");
				continue;
			}
			 //숫자가 아닌 문자입력시 재입력
			while(true) {
				try {
					System.out.print("첫 번째 숫자 입력 :");
					n1 = Double.parseDouble(sc.nextLine());
					break;

				} catch(Exception e){                 
					System.out.println("숫자만");
				}
			}		
			 //숫자가 아닌 문자입력시 재입력
			while(true) {
				try {
					System.out.print("두 번째 숫자 입력: ");
					n2=Double.parseDouble(sc.nextLine());
					break;
				} catch(Exception e){                      
					System.out.println("숫자만");
				}
			}




			System.out.println("===== 결과 =====");
			//계산
			if(op.contentEquals("+")) {
				result=n1+n2;		
			} else if(op.contentEquals("-")) {
				result =n1-n2;	
			} else if(op.contentEquals("/")) {
				result=n1/n2;	
			} else if(op.contentEquals("*")) {
				result=n1*n2;
			}

			System.out.printf("%.2f %s %.2f = %.2f\n 카운트:%d\n",n1,op,n2,result,cnt);
			if(cnt==3) {
				System.out.println(" 계산기가 3번 실행되었습니다.");
				break;
			}
			System.out.println("종료 하시겠습니까(q) 이어가기(n) (카운트 3번 실행시 종료/n,q이외의 키는 카운트 계산 없음) ");

			String end = sc.nextLine();
			if(end.contentEquals("q")) {         //q누르면 종료
				break;
			} else if(end.contentEquals("n")) {   //n누르면 이어가기  
				cnt++;
				continue;
			} else {     

				//카운트 실행없이 이어가기
				continue;
			}

		}
		System.out.println("종료");
	}
}

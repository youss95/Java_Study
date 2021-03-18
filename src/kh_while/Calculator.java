import java.util.Scanner;

public class Quiz_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double result =0;
                 int count=1;
		while(true) {
			
			System.out.println("=== 계산기 프로그램 ====");
			System.out.println("연산자 입력(+,-,*,/)");
			String op = sc.nextLine();
				
			System.out.print("첫 번째 숫자 입력 :");
			double n1 = Double.parseDouble(sc.nextLine());
			System.out.print("두 번째 숫자 입력: ");
			double n2=Double.parseDouble(sc.nextLine());
			System.out.println("===== 결과 =====");
			
			if(op.contentEquals("+")) {
				result=n1+n2;		
			}
			else if(op.contentEquals("-")) {
				result =n1-n2;	
			}
			else if(op.contentEquals("/")) {
				result=n1/n2;	
			}
			else if(op.contentEquals("*")) {
				result=n1*n2;
			}
			
				
			
			System.out.printf("%.2f %s %.2f = %.2f\n 카운트:%d\n",n1,op,n2,result,count);
			System.out.println("종료 하시겠습니까(q) 이어가기(n) (3번 실행시 종료) ");
			if(count==3){
				System.out.println("3번실행되었습니다.");
				break;}
			String end = sc.nextLine();
			if(end.contentEquals("q")) {
				break;
			}
			else if(end.contentEquals("n")) {
				count++;
				continue;
			}
		}
		System.out.println("종료");
	}
}

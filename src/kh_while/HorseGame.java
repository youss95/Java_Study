import java.util.Scanner;

public class HorseGame {
	Scanner sc = new Scanner(System.in);
	int money=0;
	//게임 시작 
	public void game() {
		int m=0;
		while(true) {
			System.out.print("얼마를 배팅하시겠습니까?: ");
			m = sc.nextInt();


			if(money<m) {
				System.out.println("잔돈부족");
				charge();
				continue ;
			}

			System.out.println("1번말(100%)");
			System.out.println("2번말(100%)");
			System.out.println("3번말(200%)");
			int h = sc.nextInt();
			System.out.println(h+"말을 선택하였습니다.");
			int r = (int)(Math.random()*3+1);
			
			if(h==3 && h==r) {
				m=2*m;
				money+=m;
				System.out.println(m+"획득");
				break;
			}
			
			if(h==2 && h==r) {
				money+=m;
				System.out.println(m+"획득");
				break;
			}
			
			if(h==1 && h==r) {
				money+=m;
				System.out.println(m+"획득");
				break;
			} else {
				System.out.println("실패");
				System.out.println(m+"만큼 차감");
				money-=m;
				break;
			}
		}
	}
	//충전
	public void charge() {
		System.out.println("얼마를 충전 하시겠습니까?");
		int c = sc.nextInt();
		money+=c;
		System.out.println(money+"이 되었습니다.");

	}
	//잔액 조회
	public void search() {
		System.out.println("현재 잔액은"+money+"입니다.");
	}

	public static void main(String[] args) {
		Horse hr = new Horse();
		a:while(true) {
			System.out.println("경마게임에 오신 것을 환영합니다.");
			System.out.println("1. 게임 시작");
			System.out.println("2. 잔액 충전");
			System.out.println("3. 잔액 조회");
			System.out.println("4. 종료");
			System.out.print(">>> ");
			Scanner sc = new Scanner(System.in);
			int input = Integer.parseInt(sc.nextLine());


			switch(input) {
			case 1:
				hr.game();
				break;
			case 2:
				hr.charge();
				break ;
			case 3:
				hr.search();
				break;
			case 4:
				System.out.println("종료");
				break a;
			}
		}

	}
}

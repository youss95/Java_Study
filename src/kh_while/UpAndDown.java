import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int cnt=0;  //score
		int n=0;    // 내가 입력한 수
		int tmp=0;  //score를 비교하기 위해 이전의 cnt를 저장해둔다
		int max=0;  //최고신기록
		abc:while(true) {

			System.out.println("== UP & DOWN GAME ==");
			System.out.println();
			System.out.println("1. Game Start");
			System.out.println("2. Game Score");
			System.out.println("3. End Game");
			System.out.print(">>> ");
			int input =Integer.parseInt(sc.nextLine());

			switch(input) {
			case 1:
				System.out.println("<< Game Start >>");
				tmp=cnt;
				cnt=0;          //cnt 초기화
				break;
			case 2:
				System.out.println("score: "+cnt);
				if(tmp<cnt) {      
					if(max<cnt) {   //첫번째 조건문을 만족하면 max의 값이 바뀌여서 if문추가
						max=cnt;    
						System.out.println("최고신기록 경신");
						System.out.println("현재 최고신기록은 "+max);
					}
				} else {
					System.out.println("최고신기록을 경신하지 못하였습니다.");
					System.out.println("현재 최고신기록은 "+max);
				}
				continue;
				
			case 3:
				System.out.println("종료합니다");
				break abc;
			}

			//1-100까지

			int com=(int)(Math.random()*100+1);

			while(true) {
				try {
					System.out.print("Input Number: ");
					n = Integer.parseInt(sc.nextLine());
					if(n<1||n>100) {
						System.out.println("1에서 100사이의 수 입력하세요");   //1~100사이수 아니면 다시
						continue;
					}
				}
				catch(Exception e) {
					System.out.println(" 형식에 맞는 숫자를 입력 바람");  //숫자가 아닌 문자가 입력되면 다시
					continue;
				} 
				if(n<com) {
					cnt++;
					System.out.println("UP");

				} else if(n>com) {
					cnt++;
					System.out.println("DOWN");

				} else {
					cnt++;
					System.out.println("정답입니다.");
					break;
				}

			}
		}
	}

}

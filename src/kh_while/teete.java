package kh_while;

import java.util.Scanner;

public class teete {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("점수로 계산하는 심리테스트");
		System.out.print("1. 당신은 언제 가장 기분이 좋습니까? 1.아침(1점) 2.밤(2점)\n");
		System.out.print(">>");
		int n1 = Integer.parseInt(sc.nextLine());
		System.out.print("2. 당신의 평소 걸음걸이 보폭? 1.보폭이 크고 빠른걸음(1점) 2. 매우 느린걸음(2점)\n");
		System.out.print(">>");
		int n2 =Integer.parseInt(sc.nextLine());
		System.out.println("3. 당신은 사람들과 얘기할때 주로 무슨 행동을 합니까? 1.자신의 손을 꼭 쥔다(1점) 2.자신의 머릿카락을 만진다(2점)");
		System.out.print(">>");
		int n3 =Integer.parseInt(sc.nextLine());
		System.out.println("4. 당신은 앉아서 쉴때 어떤 행동을 합니까? 1.한 다리를 다른 다리에 말고(1점) 2.다리를 꼰다(2점)");
		System.out.print(">>");
		int n4= Integer.parseInt(sc.nextLine());
		int result =n1+n2+n3+n4;
		if(result>=7) {
			System.out.println("A:7이상\n 다른 사람들은 당신을 조심스럽게 대해야 할 사람이라고\r\n"
					+ "생각하고 있다.");
		}
		else if(result>=6 && result <7) {
			System.out.println("B: 6~7미만\n 당신의 친구들은 당신을 활기차고, 열정적인 사람이며,\r\n"
					+ "충동적인 성격의 소유자로 알고 있다.");
		}
		else if(result>=5 && result<6) {
			System.out.println("C: 5~6미만\n 다른 사람들은 당신을 신선하고 , 생기 활발하며, 매력적이고,\r\n"
					+ "재미있고, 항상 즐거운 사람으로 여기고 있다.");
		}
		else {
			System.out.println("F: 2미만\n 사람들은 당신을 매우 수줍음이 많고, 소극적인 사람으로\r\n"
					+ "생각하며,우유부단하다고 여길 수 있다.");
		}
	}

}

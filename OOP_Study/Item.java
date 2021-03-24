import java.util.Scanner;

public class Item {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이템을 입력해주세요: ");
		String str=sc.nextLine();
	Weapon w = new Weapon(str);
	w.result(w);
	}
}

class Weapon{
	Scanner sc = new Scanner(System.in);
	//field
	int up=0;
	String name;
	int money=100000;
	//constructor
	Weapon(String name){
		this.name=name;
	}
	//method 업그레이드
	void upgrade(Weapon w){
		System.out.println("아이템을 업그레이드 합니다. (비용: 1000)");
		w.up++;
		money-=1000;
		System.out.println("현재 돈: "+money);
	}
	
	//method 강화샐행
	void result(Weapon w) {
		
		while(true) {
			System.out.println("현재: "+w.up+"강");
			System.out.println(this.name+"를 강화 하시겠습니까? 1.강화 2.취소");
			int input=Integer.parseInt(sc.nextLine());
		if(input==1) {
			//확률 90% 부터 10%씩 낮아진다
			if(Math.random()>0.1 && w.up==0) {
				upgrade(w);
				System.out.println(this.name+"이(가) "+w.up+"으로 강화되었습니다.");
				continue;
			} else if(Math.random()>0.2 && w.up==1) {
				upgrade(w);
				System.out.println(this.name+"이(가) "+w.up+"으로 강화되었습니다.");
			    continue;
			} else if(Math.random()>0.3 && w.up==2) {
				upgrade(w);
				System.out.println(this.name+"이(가) "+w.up+"으로 강화되었습니다.");
				continue;
			} else if(Math.random()>0.4 && w.up==3) {
				upgrade(w);
				System.out.println(this.name+"이(가) "+w.up+"으로 강화되었습니다.");
				continue;
			} else if(Math.random()>0.5 && w.up==4) {
				upgrade(w);
				System.out.println(this.name+"이(가) "+w.up+"으로 강화되었습니다.");
				continue;
			} else if(Math.random()>0.6 && w.up==5) {
				upgrade(w);
				System.out.println(this.name+"이(가) "+w.up+"으로 강화되었습니다.");
				continue;
			} else if(Math.random()>0.7 && w.up==6) {
				upgrade(w);
				System.out.println(this.name+"이(가) "+w.up+"으로 강화되었습니다.");
				continue;
			} else if(Math.random()>0.8 && w.up==7) {
				upgrade(w);
				System.out.println(this.name+"이(가) "+w.up+"으로 강화되었습니다.");
				continue;
			} else if(Math.random()>0.9 && w.up==8) {
				upgrade(w);
				System.out.println(this.name+"이(가) "+w.up+"으로 강화되었습니다.");
				continue;
			} else if(Math.random()>0.93 && w.up==9) {
				upgrade(w);
				System.out.println(this.name+"이(가) "+w.up+"으로 강화되었습니다.");
				continue;
			} else if(Math.random()>0.97 && w.up==7) {
				upgrade(w);
				System.out.println(this.name+"이(가) "+w.up+"으로 강화되었습니다.");
				continue;
				//강화실패 case
			} else {
				if(w.up>0) {
				System.out.println("강화실패");
				w.up--;
				money-=1000;
				System.out.print("현재 돈: "+money);
				continue;
				} else if(w.up==0) {
					System.out.println("강화실패");
					money-=1000;
					System.out.print("현재 돈: "+money);
					continue;
				}
			}
		} else if(input==2) {
			System.out.println("종료됩니다.");
			break;
	  }
	}
  }			
}

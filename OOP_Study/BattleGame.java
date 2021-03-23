public class BattleGame {

	public static void main(String[] args) throws InterruptedException {
		Hero me = new Hero("김사용");
		Monster d = new Monster("괴물");
		Medic md = new Medic("메딕",30);

		Hero.battle(me, d,md);
	}

}

class Hero{
	String name;
	int hp=25;

	Hero(String name){
		this.name=name;
	}
	//나의 공격 메서드
	static void punch(Monster d,Hero a) {
		System.out.println(a.name+" 이 펀치를 하였습니다.");
		d.hp--;
		System.out.println("괴물의 체력은"+d.hp);
	}
	static void battle(Hero a,Monster d,Medic md) throws InterruptedException {
		while(a.hp>0 && d.hp>0) {


			if(Math.random()>0.5) {
				Hero attacker;
				Monster defender;
				attacker=a;
				defender=d;
				attacker.punch(defender, attacker);

			}
			else {
				Monster attacker;
				Hero defender;
				attacker=d;
				defender=a;
				attacker.punch(defender);
			}

			Thread.sleep(300);

			if(a.hp==0) {
				System.out.println("괴물의 승리");
				break;
			}
			if(d.hp==0) {
				System.out.println("나의 승리");
				break;
			}
			if(a.hp<=5 && a.hp>0) {
				if(Math.random()>0.8) {
					md.heal(a);
					continue;
				}
			}

		}
	}

}
//괴물 클래스
class Monster{
	String name;
	int hp=30;
	Monster(String name){
		this.name=name;
	}
	//괴물의 공격 메서드
	static void punch(Hero a) {
		System.out.println("괴물이 공격을 하였습니다");
		a.hp--;
		System.out.println("나의 체력은"+a.hp);
	}


}
//메딕 클래스
class Medic{
	String name;
	int hp;
	
	public Medic(String name,int hp) {
		this.name=name;
		this.hp=hp;
	}
	//체력 회복 메서드
	public void heal(Hero a) {
		this.hp-=5;
		if(this.hp==0) {
			System.out.println("메딕이 죽었습니다.");
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("메딕이"+a.name+"을 치유");
		System.out.println("메딕의 hp: "+this.hp);
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		a.hp+=2;
		System.out.println(a.name+"의 체력이"+a.hp+"가 되었습니다.");
	}
}

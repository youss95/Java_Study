

public class Hakwon {
	public static void main(String[] args) {
		Student st = new Student("사용",30);  //초기 name을 사용, hp를30으로 설정하겠다
		Teacher JST = new Teacher("JST",20);
		st.learn();
		JST.teach(st);
	}
}

class Student{
	//필드
	private String name; //접근제한자 private
	int hp;
	int knowledge=0;
	
    //생성자
	//생성자가 없어도 되지만 만약 생성자를 사용 안한다면 메인에다가 st.setname("이름")메서드를 따로 불러와야됨
	//생성자는 초기값세팅을 하는 목적 
	Student (String name, int hp) {
		this.name=name;
		this.hp=hp;
	}
	//getter, setter(private 접근자 변수를 외부에서 사용하려고 만듬)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//메소드
	public void learn() {
		System.out.println("learn메소드 실행");
		System.out.println("코딩을 배웁니다");
		hp--;
		System.out.println("체력이 "+hp+"로 떨어졌습니다.");
		System.out.println("=======================");
	}
}

class Teacher{
	//필드(속성)
	String name;
	int hp;
	int money=0;

	//생성자
	Teacher(String name, int hp){
		this.name=name;
		this.hp = hp;
	}

	//메서드
	//매개변수가 Student라는 참조자료형을 받아 왔기때문에 
	//s.속성 같은 형태를 사용 가능
	public void teach(Student s){
		s.setName("이름변경");    //setter 활용해봄 이거 안쓰면 "사용"으로 나온다
		s.knowledge++;
		System.out.println("teach메소드 실행");
		System.out.println(s.getName()+"의 지식이 "+s.knowledge+"만큼 올랐습니다.");
		hp--;
		money+=1000;
		System.out.println("체력이"+hp+"로 떨어졌습니다");
		System.out.println(money+"을 획득했습니다");
	}

}

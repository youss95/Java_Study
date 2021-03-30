package vo;
//실버 등급 회원
public class Silver extends Member {


	
	public Silver(String id, String name, int point) {
		
	super(id,name,point);
	}
	@Override
	public double getBonus() {        //멤버파일에 있는 getBouns를 오버라이드->abstract를 사용하여 내용구현해주기로 바
		return this.getPoint()*0.02;
	}
	
}

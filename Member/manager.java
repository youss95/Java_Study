package manager;

import java.util.HashSet;

import vo.Gold;
import vo.Member;
import vo.Silver;

public class Manager {	

	private HashSet<Member> members ;
	private int index=0;

	public Manager() {
		this.members = new HashSet();
	}
//회원 정보 등록
	public void add1(Member m) {
		this.members.add(m);
	}


//회원 정보 출력
	public void printMembers() {
		for(Member x : members) {
			System.out.println("id: "+x.getId()+" "+"name: "+x.getName()+" "
					+"point: "+x.getPoint()+" "+"bonus:  "+x.getBonus());
		}

	}

//회원 포인트 추가
	public void plus(String name, int j) {
		int k=0;
		for(Member x : members) {
			if(x.getName().equals(name)) {
				k=x.getPoint()+j;
				x.setPoint(k);
				System.out.println(x.getName()+"의 포인트가"+k+"가 되었습니다.");
			}
		}
	}
}

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LottoSimulation {

	public static void main(String[] args) {
		int count_s=0;
		
		
		HashSet set1= new HashSet();
		HashSet set2= new HashSet();
		
		for(int i=0; set1.size()<6; i++) {
			int num=(int)(Math.random()*45)+1;
			set1.add(num);                     //set1에 num저장
		}
		
		List list = new LinkedList(set1);   //sort메소드 사용하기 위해서 List컬렉션 필요
		Collections.sort(list);             //정렬
		System.out.println("로또번호"+list);
		a:
			while(true) {
				int count=0;
				set2.removeAll(set2);           //기존 저장되어 있는 요소들을 모두 삭제
				for(int i=0; set2.size()<6; i++) {
				  int num2=(int)(Math.random()*45)+1;
					set2.add(num2);
				}
				
				List list2 = new LinkedList(set2);
				Collections.sort(list2);
				count_s++;
				System.out.println(count_s+"번째");
				System.out.println("나의번호: "+list2);
				System.out.println("당첨번호: "+list);
				
				for(int j=0;j<set2.size();j++) {
					if(list.get(j)==list2.get(j)) {
						count++;
					}
					if(count==6) {
						System.out.println(count_s+"번째");
						System.out.println("당첨");
						System.out.print("로또번호: "+list+"\n");
						System.out.print("나의번호: "+list2+"\n");
						System.out.print("확률: "+(double)1/count_s*100);
						break a;
					} else {
						continue;
					}
				}
			}

	}

}



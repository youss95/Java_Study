package student;

public class Manager {
private Student list[]=new Student[10];
private int i=0;
private double sum=0;
private double avg=0;
public Manager() {}

//정보 입력 메소드
public void addData(Student s) {
	list[i++]=s;
}

//학생 정보 출력 메소드
public void printAll() {
	for(int i=0 ; i<this.i; i++) {
	System.out.println("id: "+list[i].getId()+" "+"name: "+list[i].getName()+" "+"korean: "+list[i].getKo()+" "+"english: "+list[i].getEn());
	sum=list[i].getEn()+list[i].getKo();
	avg=sum/2;
	System.out.println("합계: "+sum);
	System.out.println("평균: "+avg);
	}
}
//또 다른 정보 입력 메소드
public void add2(String id,String name,int ko,int en) {
	list[i++]=new Student(id,name,ko,en);
}
//정보 찾기 메소드
public void search(String name) {
	for(int i=0; i<this.i; i++) {
		if(list[i].getName().equals(name)) {
			System.out.println("id: "+list[i].getId()+" "+"name: "+list[i].getName()+" "+"korean: "+list[i].getKo()+" "+"english: "+list[i].getEn());
			sum=list[i].getEn()+list[i].getKo();
		}
	}
}
}

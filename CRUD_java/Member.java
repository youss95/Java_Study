package vo;
import lombok.*;
@Getter
@Setter

public class Member {
private String id;
private String name;
private int ko;
private int en;
private int math;



public Member(String id,String name,int ko,int en,int math) {
	this.id=id;
	this.name=name;
	this.ko=ko;
	this.en=en;
	this.math=math;
}


public int getSum() {
	return ko+en+math;
}


}

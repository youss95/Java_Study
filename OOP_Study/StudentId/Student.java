package student;

public class Student {
private String id;
private String name;
private int ko;
private int en;

public Student (){}
public Student(String id,String name,int ko ,int en) {
	this.id=id;
	this.name=name;
	this.ko=ko;
	this.en=en;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getKo() {
	return ko;
}
public void setKo(int ko) {
	this.ko = ko;
}
public int getEn() {
	return en;
}
public void setEn(int en) {
	this.en = en;
}

}

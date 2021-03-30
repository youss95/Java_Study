package vo;

public class Gold extends Member{
	
	
	
	public Gold(String id, String name, int point) {
		
		super(id,name,point);
	}
	@Override
	public double getBonus() {        
		return this.getPoint()*0.03;
	}
	
}

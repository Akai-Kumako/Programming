public class Circle extends Figure{
	private int radius = 0;

	//コンストラクタ
	public Circle(int radius){
		setRadius(radius);
	}
	public Circle(){
		setRadius(100);
	}

	public void setRadius(int radius){
		this.radius = radius;
	}
	public int getRadius(){
		return radius;
	}
	
	public void calcArea(){
		area = Math.PI * radius * radius;
		System.out.printf("半径 %d の円の面積は		%.2f\n", radius, area);				
	}
}

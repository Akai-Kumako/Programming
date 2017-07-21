public class Rectangle extends Figure{
	private int side_a = 0;
	private int side_b = 0;

	//コンストラクタ
	public Rectangle(int side_a, int side_b){
		setSides(side_a, side_b);
	}
	public Rectangle(){
		setSides(100, 100);
	}

	public void setSides(int side_a, int side_b){
		this.side_a = side_a;
		this.side_b = side_b;
	}
	public int getSideA(){
		return side_a;
	}
	public int getSideB(){
		return side_b;
	}
	
	public void calcArea(){
		area = side_a * side_b;
		System.out.printf("%d * %d の長方形の面積は	%.2f\n", this.side_a, this.side_b, area);
	}
}

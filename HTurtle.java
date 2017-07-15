public class HTurtle extends Turtle{
	
	//コンストラクタ
	public HTurtle(int x, int y, int angle){
		super(x, y, angle);
	}

	public void polygon(int n, int s){
		int a = 360 / n;
		for(int j = 0; j < n; j++){
			fd(s);
			rt(a);
		}
	}
	public void house(int s){
		polygon(4, s);
		fd(s); rt(30);
		polygon(3, s);
		lt(30); bk(s);
	}
}

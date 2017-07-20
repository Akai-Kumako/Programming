public class MyTurtle extends HTurtle{
	public void houses(int n, int s, int w){
		for(int i = 0; i < n; i++){
			house(s);
			rt(90);
			up();
			fd(s + w);
			down();
			lt(90);
		}
	}
	public void ppolygon(int n, int m, int s){
		rt(90);
		for(int i = 0; i < n; i++){
			polygon(m, s);
			fd(s);
			lt(360 / n);	
		}
	}
}

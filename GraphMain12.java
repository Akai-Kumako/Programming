public class GraphMain12{
	public static void main(String[] args){
		TurtleFrame f = new TurtleFrame();
		Turtle m;
		if(args.length == 1 && args[0].equals("graph")){
			m = new Graph(40, 200);
		}else{
			m = new Turtle();
		}
		f.add(m);
		drawMethod(m);
	}
	static void drawMethod(Turtle t){
		for(int i = 0; i < 5; i++){
			t.fd(100); t.rt(144);
		}
		int n=51;
		int[] x = new int[n], y = new int[n];
		for(int i=0; i<n; i++){
			x[i]=7*i;
			y[i]=(int)(100*Math.sin(2*Math.PI*i/(n-1)));
		}
		if(t instanceof Graph){
			((Graph)t).drawlines(n, x, y);
		}
	}



}

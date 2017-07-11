public class GraphMain111{
 public static void main(String[] args){
 	int x0=20, y0=200, xmin=0, xmax=360, ymin=-180, ymax=180;
	TurtleFrame f = new TurtleFrame();
	Graph111 m = new Graph111(x0, y0);
	//Graph111 m = new Graph111(); 
        f.add(m);

	m.setOrigin(x0, y0); 
          // x0, y0がprivateの場合は直接アクセスできないので，
          // セッターを用いてアクセスする．

	System.out.println("Origin("+m.getOriginX()+","+m.getOriginY()+")");
          // 原点座標の表示

	m.drawAxis(xmin, xmax, ymin, ymax); // 軸の表示

	/*
	int n=51;
	int[] x = new int[n], y = new int[n];
	for(int i=0; i<n; i++){
		x[i]=7*i; // +x0を削除 
		y[i]=-(int)(100*Math.sin(2*Math.PI*i/(n-1))); //+y0を削除
	}
	m.drawlines(n, x, y);
	*/

	int n=51;
	double[] x = new double[n], y = new double[n];
	for(int i=0; i<n; i++){
		x[i]=(double)i;
		y[i]=Math.sin(2*Math.PI*i/(n-1));
	}
	m.drawlines(n, 7.0, 100.0, x, y);
 }
}

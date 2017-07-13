public class GraphMain111{
 public static void main(String[] args){
 	int x0=20, y0=200, xmin=0, xmax=360, ymin=-180, ymax=180;
	TurtleFrame f = new TurtleFrame();
	Graph m = new Graph(x0, y0);
        f.add(m);

	m.setOrigin(x0, y0); 

	System.out.println("Origin("+m.getOriginX()+","+m.getOriginY()+")");

	m.drawAxis(xmin, xmax, ymin, ymax);

	int n=51;
	double[] x = new double[n], y = new double[n];
	for(int i=0; i<n; i++){
		x[i]=(double)i;
		y[i]=Math.sin(2*Math.PI*i/(n-1));
	}
	m.drawlines(n, 7.0, 100.0, x, y);
 }
}

public class Graph extends Turtle{
	private int origin_x = 0;
	private int origin_y = 0;
	public void drawlines(int n, int x[], int y[]){
		for(int i = 0; i < n; i++){
			moveTo(x[i] + origin_x, -y[i] + origin_y);
		}
	}
	public void drawlines(int n, double ax, double ay, double x[], double y[]){
		for(int i = 0; i < n; i++){
			moveTo(x[i] * ax + origin_x, -y[i] * ay + origin_y);
		}
	}
	public void setOrigin(int origin_x, int origin_y){
		this.origin_x = origin_x;
		this.origin_y = origin_y;
	}
	public int getOriginX(){
		return origin_x;
	}
	public int getOriginY(){
		return origin_y;
	}
	public void drawAxis(int xmin, int xmax, int ymin, int ymax){
		setColor(java.awt.Color.red);
		up(); moveTo(xmin+origin_x, origin_y, 0);
		down(); moveTo(xmax+origin_x, origin_y, 180);
		up(); moveTo(origin_x, ymin+origin_y, 90);
		down(); moveTo(origin_x, ymax+origin_y, 90);
		up(); moveTo(origin_x, origin_y, 90); down();
		setColor(java.awt.Color.black);
	}
}

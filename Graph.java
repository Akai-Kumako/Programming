public class Graph extends Turtle{
	private int origin_x = 0;
	private int origin_y = 0;
	public void drawlines(int n, int x[], int y[]){
		for(int i = 0; i < n; i++){
			moveTo(x[i] + origin_x, -y[i] + origin_y);
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
}

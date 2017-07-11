public class Graph extends Turtle{
	public int origin_x;
	public int origin_y;
	public void drawlines(int n, int x[], int y[]){
		for(int i = 0; i < n; i++){
			moveTo(x[i] + origin_x, -y[i] + origin_y);
		}
	}
}

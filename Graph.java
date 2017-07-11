class Graph extends Turtle{
	public void drawlines(int n, int x[], int y[]){
		for(int i = 0; i < n; i++){
			moveTo(x[i], y[i]);
		}
	}
}

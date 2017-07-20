public class Ex141{
	public static void main(String[] args){
		TurtleFrame f = new TurtleFrame();
		MyTurtle m = new MyHTurtle();
		f.add(m);
		m.up(); m.moveTo(50, 250, 0); m.down();
		m.houses(5, 40, 10);
	}
}

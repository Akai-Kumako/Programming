public class Ex142{
	public static void main(String[] args){
		Figure[] figs = new Figure[10];
		int[] circle = {20, 40, 50, 60, 70};
		int[] rectangle_a = {10, 30, 50, 70, 90};
		int[] rectangle_b = {15, 25, 35, 45, 55};		

		for(int i = 0; i < 10; i++){
			if(i % 2 == 0){
				figs[i] = new Circle(circle[(int)(Math.random()*5)]);
			}else{
				figs[i] = new Rectangle(rectangle_b[(int)(Math.random()*5)], rectangle_b[(int)(Math.random()*5)]);	
			}	
		}
		for(int i = 0; i < 10; i++){
			figs[i].calcArea();
		}
	}
}

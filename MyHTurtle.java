public class MyHTurtle extends MyTurtle{
	public void house(int s){
                polygon(4, s);
		up(); fd(s / 4); rt(90); fd(s / 4); lt(90); down();
		polygon(4, s / 2);
		up(); bk(s / 4); lt(90); fd(s / 4); rt(90); down();
                fd(s); rt(30);
                polygon(3, s);
                lt(30); bk(s);
        }
}

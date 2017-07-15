public class Tensen extends HTurtle{
	int psize = 3;
	
	//コンストラクタ
	public Tensen(int x, int y, int angle){
		super(x, y, angle);
	}

	public static int[] number(int v){
		int[] number = new int[v];
		for(int i = 0; i < v / 2; i++){
			number[i] = i + 1;
		}
		for(int j = v - (v / 2), i = v / 2; j > 0; j--, i++){
			number[i] = j;
		}
		return number;
	}
	public static int[] number(){
		int[] number = {1, 2, 3, 3, 2, 1};
		return number;		
	}


	public void fd(int s){
		int k, len;
		if(isDown()){
			for(k = 0, len = 0; len + psize <= s; k++, len += psize){
				if(k % 2 == 0) down(); else up();
				super.fd(psize);
			}
			down();
			super.fd(s - len);
		}else{
			super.fd(s);
		}
	}
	public static void main(String[] args){
		TurtleFrame f = new TurtleFrame();
		boolean argsflag = false;
		int v = 0;
		if(args.length == 1){
			try {
				v = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.out.println("数字以外が入力されました.");
			}
		}else{
			v = 6;
		}

		Turtle[][] tm = new Turtle[v][];

		for(int n = 0; n < tm.length; n++){
			tm[n] = new Turtle[number(v)[n]];
			for(int m = 0; m < tm[n].length; m++){
				if((n + m) % 2 == 0){
					tm[n][m] = new Turtle(m * 50 + 50, n * 50 + 50, 0);
				}else if((n + m) % 2 == 1){
					tm[n][m] = new Tensen(m * 50 + 50, n * 50 + 50, 0);
				}f.add(tm[n][m]);
			}
		}
		for(int n = 0; n < tm.length; n++){
			for(int m = 0; m < tm[n].length; m++){
				for(int j = 0; j < number(v)[n] + 2; j++){
					tm[n][m].fd(10 + (m * 10));
					tm[n][m].rt(360 / (number(v)[n] + 2));
				}
			}
		}
	}

}

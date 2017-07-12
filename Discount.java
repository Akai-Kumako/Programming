public class Discount{
	public int cashier(int product_1){
		return (int)(product_1 * 0.95);
	}
	public int cashier(int product_1, int product_2){
		return (int)((product_1 + product_2) * 0.90);
	}
}

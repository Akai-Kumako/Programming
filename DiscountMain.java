import java.util.Scanner;
public class DiscountMain{
	public static void main(String[] args){
		Discount discount = new Discount();

		try{
			System.out.println("商品の価格を入力してください.");

			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			String[] products = str.split(" ", 0);
			if(products.length > 2)
				System.out.println("入力された数が多過ぎます.");
			else if(products.length == 1)
				System.out.println("1つで" + discount.cashier(Integer.parseInt(products[0])) + "です.");
			else if(products.length == 2)
				System.out.println("2つで" + discount.cashier(Integer.parseInt(products[0]), Integer.parseInt(products[1])) + "です.");
		}catch (NumberFormatException e){
			System.out.println("正しく入力してください.");
		}		

	}
}

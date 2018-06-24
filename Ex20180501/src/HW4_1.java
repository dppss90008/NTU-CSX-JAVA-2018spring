import java.util.Scanner;

public class HW4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入兩個整數，將為您找出最大公因數");
		Scanner in = new Scanner(System.in);
		System.out.print("請輸入第一個數字: ");
		int a = in.nextInt();
		System.out.print("請輸入第二個數字: ");
		int b = in.nextInt();
		in.close();
		System.out.println("最大公因數為 "+GCD(a,b));
	}
	
	public static int GCD(int x,int y) {
		if (x==0) return y;
		if (x%y == 0) return y;
		else return GCD(y,x%y);
		
	}
}

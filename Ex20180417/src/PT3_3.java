import java.util.Scanner;

public class PT3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("請輸入3個整數數字,\n程式將自動為您排列 \n" 
				+ "(請以空白鍵為分隔符號ex.輸入1 2 3)\n"
				+ "====================\n輸入: ");

		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		in.close();
		System.out.print("結果: ");
		if (num1 < num2 & num2 < num3) {
			System.out.printf("%d %d %d", num1, num2, num3);
		} else if (num3 < num2 & num2 < num1) {
			System.out.printf("%d %d %d", num3, num2, num1);
		} else if (num1 < num3 & num3 < num2) {
			System.out.printf("%d %d %d", num1, num3, num2);
		} else if (num2 < num3 & num3 < num1) {
			System.out.printf("%d %d %d", num2, num3, num1);
		} else if (num3 < num1 & num1 < num2) {
			System.out.printf("%d %d %d", num3, num1, num2);
		} else {
			System.out.printf("%d %d %d", num2, num1, num3);
		}

	}

}

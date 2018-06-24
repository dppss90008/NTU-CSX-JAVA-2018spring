import java.util.Scanner;

public class PT3_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入3個整數數字,\n程式將自動為您排列 \n====================\n輸入: ");

		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		in.close();

		int temp;
		
		if (num2 < num1) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num3 < num1) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num3 < num2) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		System.out.printf("%d %d %d",num1,num2,num3);

	}

}

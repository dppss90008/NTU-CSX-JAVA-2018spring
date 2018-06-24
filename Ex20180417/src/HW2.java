import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請依序輸入國文、英文、數學成績，\n本程式將自動為您計算總分及平均。");
		System.out.println("==============================");
		
		Scanner in = new Scanner(System.in);
		System.out.print("請輸入國文成績: ");
		int Chinese = in.nextInt();
		System.out.print("請輸入英文成績: ");
		int Eng = in.nextInt();
		System.out.print("請輸入數學成績: ");
		int Math = in.nextInt();
		in.close();

		int Sum = Chinese + Eng + Math;
		double Avg = (double) Sum / 3;

		System.out.printf("您的總分為 %d, 平均為 %.2f", Sum, Avg);
	}

}

import java.util.Scanner;

public class PT2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("請輸入底:");
		int down = in.nextInt();
		System.out.print("請輸入高:");
		int height = in.nextInt();
		in.close();
		// 強制轉型成double 型態
		double Area = (double) down * height / 2;
//		double Area = down * height / (double) 2;
		// System.out.printf("三角形面積為%.2f", Area);
		// Area 自動轉換資料型態成字串，字串和字串合併
		System.out.print("三角形面積為" + Area);

	}

}

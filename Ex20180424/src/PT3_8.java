import java.util.Scanner;

public class PT3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0, Sum = 0, ct = 0, Max = 0;
		Scanner in = new Scanner(System.in);
		do {

			System.out.print("請輸入一個正整數 [負數則結束]: ");
			n = in.nextInt();
			if (n < 0) {
				break;
			}
			Sum += n;
			ct += 1;
			if (n > Max) {
				Max = n;
			}
		} while (n > 0);
		in.close();
		System.out.printf("共輸入 %d 個數字\n",ct);
		System.out.printf("總和是 %d\n",Sum);
		System.out.printf("平均是 %.2f\n",(double)Sum/ct);
		System.out.printf("最大值是 %d",Max);
	}

}

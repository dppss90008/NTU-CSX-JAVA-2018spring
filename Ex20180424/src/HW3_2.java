import java.util.Scanner;

public class HW3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("本程式將自動為您判斷是否為質數");
		System.out.print("請輸入整數: ");
		int n = in.nextInt();
		in.close();

		int i, ct = 0;
		for (i = 1; i <= n; i++) {
			if (n % i == 0)
				ct += 1;
		}
		if (ct == 2) {
			System.out.printf("%d 是質數", n);
		} else {
			System.out.printf("%d 不是質數", n);
		}
		// System.out.println(ct);

	}

}

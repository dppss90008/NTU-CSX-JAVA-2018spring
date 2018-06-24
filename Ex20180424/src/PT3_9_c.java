import java.util.Scanner;

public class PT3_9_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("請輸入一個整數: ");
		n = in.nextInt();
		in.close();
		int i, j;
		int ct = 1;
		for (i = 0; i < n; i++) {
			for (j = 0; j < i + 1; j++) {
				System.out.printf("%-2d ", ct);
				ct += 1;
			}
			System.out.println();
		}
	}

}

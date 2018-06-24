import java.util.Scanner;

public class PT3_9_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("請輸入一個整數: ");
		n = in.nextInt();
		in.close();
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (j = n-i; j > 0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

import java.util.Scanner;

public class HW3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("費氏數列: 本程式將為您算出第N個數字");
		Scanner in = new Scanner(System.in);
		System.out.print("請輸入一個整數N: ");
		int n = in.nextInt();
		in.close();

		int a1 = 0, a2 = 1, a3 = 1;
		int i;
		for(i=1;i<n;i++) {
			a1 = a2;
			a2 = a3;
			a3 = a1+a2;
		}
		System.out.println("此數為: "+a1);
	}

}

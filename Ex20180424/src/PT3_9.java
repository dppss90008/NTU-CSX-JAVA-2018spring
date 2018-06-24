import java.util.Scanner;

public class PT3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		in.close();
		int i,j;
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}

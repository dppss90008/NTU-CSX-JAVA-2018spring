import java.util.Scanner;

public class HW3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("找出所有因數");
		System.out.print("請輸入整數: ");
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		int i;
		for(i=1;i<=N;i++) {
			if(N%i==0) {
				System.out.print(i+" ");
			}
			
		}
		
		
	}

}

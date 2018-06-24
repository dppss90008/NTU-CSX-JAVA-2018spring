import java.util.Scanner;

public class HW3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("輸入整數，顯示1~N之間(不包含1、N)所有偶數");
		System.out.print("輸入整數: ");
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.close();
		int i;
		for(i=1;i<N;i++) {
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
		
	}

}

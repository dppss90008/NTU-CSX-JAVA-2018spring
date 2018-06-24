import java.util.Scanner;

public class PT4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			draw_stars(i);
		}
		
	}

	public static void draw_stars(int len) {

		for (int i = 1; i <= len; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

}

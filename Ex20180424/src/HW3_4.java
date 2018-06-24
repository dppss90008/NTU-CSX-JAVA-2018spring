import java.util.Scanner;

public class HW3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("1!+2!+...+20!= ");
		int n = 20;
		long Sum = 0;
		long fact = 1;
		int i, j;
		
		for (i = 1; i <= n; i++) {
			fact = 1;
			for (j = 1; j <= i; j++) {
				fact *= j;
			}
			Sum += fact;
		}
		System.out.println(Sum);
	}

}

import java.util.Scanner;

public class HW5_2 {

	public static void main(String[] args) {
		System.out.println("請輸入10個學生的成績");
		int[] score = new int[10];
		Scanner in = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.printf("請輸入第%d號學生成績:",i+1);
			score[i]=in.nextInt();
		}
		System.out.print("請輸入一小整數: ");
		int Min = in.nextInt();
		System.out.print("請輸入一大整數: ");
		int Max = in.nextInt();
		
		System.out.printf("成績介於(%d<=score<=%d)的有:\n",Min,Max);
		System.out.println("座號\t成績");
		for(int i=0;i<10;i++) {
			if( Min<=score[i] && score[i]<=Max) {
				System.out.printf("%d\t%d\n",i+1,score[i]);
			}
				
				
		}
		
		in.close();

	}

}

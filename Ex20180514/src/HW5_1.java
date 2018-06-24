
public class HW5_1 {

	public static void main(String[] args) {
		System.out.println("成績統計程式(利用二維陣列儲存成績)");
		System.out.println("座號 \t國文\t英文\t數學 \t總分\t平均");
		int[][] score = { { 76, 80, 66 }, { 88, 92, 35 }, { 90, 94, 95 }, { 100, 98, 78 }, { 68, 70, 56 } };
		int Sum=0;
		double Avg=0;
		for (int i = 0; i < score.length; i++) {
			System.out.print(i+1+"\t");
			for (int j = 0; j < score[i].length; j++) {
				System.out.printf("%d\t",score[i][j]);
				Sum += score[i][j];
			}
			Avg = (double)Sum/3;
			System.out.printf("%d\t%.2f\n",Sum,Avg);
			Sum=0;
			Avg=0;
		}
	
	}
}

public class Ex06 {
	public static void main(String[] args) {

		// 一維陣列的初始化
		int[] math_score = new int[] { 59, 95, 90 };

		// 簡化寫法
		int[] math_score2 = { 85, 95, 90 };

		System.out.println("三位學生的成績分別為：");
		
		for (int i = 0; i < math_score.length; i++)
			System.out.println("第" + (i + 1) + "位學生的成績是：" + math_score[i]);
	}
}

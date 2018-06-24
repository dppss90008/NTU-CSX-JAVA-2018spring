public class Ex04 {
	public static void main(String[] args) {
		
		int[] math_score = new int[3];
		
		math_score[0] = 85;
		math_score[1] = 95;
		math_score[2] = 90;
		
		System.out.println("三位學生的成績分別為：");

		// JDK 1.5 之後可使用 foreach
		for (int element : math_score) {
			System.out.println(element);
		}
	}
}

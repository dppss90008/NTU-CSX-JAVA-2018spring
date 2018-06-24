import java.util.Scanner;

public class PT3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score;
		Scanner in = new Scanner(System.in);
		score = in.nextInt();
		in.close();
		if (score > 60) {
			System.out.print("You pass");
		} else {
			System.out.print("You fail");
		}
	}

}

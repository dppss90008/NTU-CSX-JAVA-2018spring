import java.util.Scanner;

public class PT3_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("請輸入等第成績: ");
		String grade = in.next();
		in.close();
		String output1;
		String output2;
		switch (grade) {
		case "A+":
			output1 = "95";
			output2 = "(90-100)";
			break;
		case "A":
			output1 = "87";
			output2 = "(85-89)";
			break;
		case "A-":
			output1 = "82";
			output2 = "(80-84)";
			break;
		case "B+":
			output1 = "78";
			output2 = "(77-79)";
			break;
		case "B":
			output1 = "75";
			output2 = "(73-76)";
			break;
		case "B-":
			output1 = "70";
			output2 = " (70-72)";
			break;
		case "C+":
			output1 = "68";
			output2 = "(67-69)";
			break;
		case "C":
			output1 = "65";
			output2 = "(63-66)";
			break;
		case "C-":
			output1 = "60";
			output2 = "(60-62)";
			break;
		case "F":
			output1 = "50";
			output2 = "(<= 50)";
			break;
		case "X":
			output1 = "0";
			output2 = "(0)";
			break;
		default:
			output1 = "Wrong Input";
			output2 = "Wrong Input";
			break;
		}
		System.out.print("百分制單科成績 :");
		System.out.println(output1);
		System.out.print("百分制分數區間 :");
		System.out.println(output2);
	}

}

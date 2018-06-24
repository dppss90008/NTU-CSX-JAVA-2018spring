import java.util.Scanner;

public class HW5_3 {

	public static void main(String[] args) {
		String[] Name = new String[3];
		int[] Score = new int[3];
		System.out.println("程式開始儲存3名學生成績");
		Scanner in = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.print("請輸入英文姓氏: ");
			Name[i] = in.next();
			System.out.print("請輸入成績: ");
			Score[i] = in.nextInt();
		}
		System.out.println("程式儲存完畢");
		System.out.println("===============================");
		System.out.println("程式開始判斷");
		System.out.print("請輸入任意英文姓氏(將為您尋找成績): ");
		String Input = in.next();
		int M = -1;
		for(int i=0;i<3;i++) {
			if(Name[i].equals(Input)) M=i;
		}
		if(M==-1) {
			System.out.println("找不到您的輸入");
		}else {
			System.out.println("姓名\t成績");
			System.out.println(Name[M]+"\t"+Score[M]);
		}
		
		in.close();
	}

}

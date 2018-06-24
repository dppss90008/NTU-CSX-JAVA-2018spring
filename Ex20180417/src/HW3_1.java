import java.util.Scanner;

public class HW3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		System.out.print("計程車車資計算程式\n");
		System.out.print("請輸入行程距離，起跳價70元(不到1.25公里)，\n超過每250公尺多5元(不足250公尺以250計算)\n");
		System.out.print("=======================\n");
		Scanner in = new Scanner(System.in);
		System.out.print("請輸入行程距離(公尺): ");
		int distance = in.nextInt();
		in.close();
		
		
		// 條件判斷: 如果行程 <= 1250公尺 則應付70元 
		System.out.print("您應付:");
		if (distance <= 1250) {
			System.out.print(70);
		// > 1250 公尺每250公尺多5元 
		} else {
			// 判斷不足250公尺，以250公尺計算
			if ((distance - 1250) % 250 > 0) {
				System.out.printf("%d",70 + ((distance- 1250) / 250 + 1) * 5);
			} else {
				System.out.print(70 + ((distance - 1250) / 250) * 5);
			}
		}
		System.out.print("元");
	}

}

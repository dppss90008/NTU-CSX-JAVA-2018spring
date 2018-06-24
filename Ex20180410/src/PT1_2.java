import java.util.Scanner;

public class PT1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 打開鍵盤，使鍵盤能夠輸入
		Scanner in = new Scanner(System.in);
		// 宣告字串，將鍵盤輸入存入字串
		String age= in.next();
		String city = in.next();
		String area = in.next();
		// 關掉鍵盤
		in.close();
		System.out.printf("你的年齡是：%s\n你住在 %s 的 %s",age,city,area);
		
	}  

}

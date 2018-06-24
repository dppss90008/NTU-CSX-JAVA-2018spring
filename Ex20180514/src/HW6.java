import java.awt.List;
import java.util.Arrays;

public class HW6 {

	public static void main(String[] args) {
		
		// 依序隨機擲出6個骰子
		int[] dice = new int[6]; 
		for(int i=0;i<6;i++) {
			dice[i] = getPoint();
		}
		
		System.out.println("依序擲出6個骰子");
		for(int i=0;i<6;i++) {
			System.out.print(dice[i]+" ");
		}
		System.out.println();

		// 可以在這裡測試6個骰子結果
//		int dice[] = {1,2,2,3,3,4};
			
		// 判斷頭獎與貳獎: 6個剛好從小排到大 及 6個點數都一樣
		if(dice[0]<dice[1] && dice[1]<dice[2] 
				&& dice[2]<dice[3] && dice[3]<dice[4] 
				&& dice[4]<dice[5]) {
			System.out.println("中頭獎!!");
			System.exit(0);
		}else if(dice[0]==dice[1] && dice[1]==dice[2] 
				&& dice[2]==dice[3] && dice[3]==dice[4] 
				&& dice[4]==dice[5]) {
			System.out.println("中二獎");
			System.exit(0);
		}
		
		int[] ct = new int[6];
		
		// 中三獎定義: 三個骰子+兩個骰子一樣
		// 計算擲骰子有幾個
		// ct[0] 代表 1 有幾個，以此類推
		for (int i = 0; i < dice.length; i++) {
	
			if(dice[i]==1) ct[0] += 1;
			if(dice[i]==2) ct[1] += 1;
			if(dice[i]==3) ct[2] += 1;
			if(dice[i]==4) ct[3] += 1;
			if(dice[i]==5) ct[4] += 1;
			if(dice[i]==6) ct[5] += 1;
		}
		// 判斷 2 and 3 是否在ct 裡面
		for (int i = 0; i < ct.length; i++) {
			if(ct[i]==2) {
				for(int j =0; j<ct.length;j++) {
					if(ct[j]==3) {
						System.out.println("中三獎!");
						System.exit(0);
					}
				}
			}
		}
		
		// 上面判斷都沒有，代表沒中獎
		System.out.println("沒中獎QQ");
						
	}
	
	/*
	 * 產生變數
	 */
	public static int getPoint() {
		int ret = (int) (Math.floor(Math.random() * 6) + 1);
		return ret;
	}

}

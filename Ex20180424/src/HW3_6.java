
public class HW3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("計算某人跑 100公尺，每秒鐘會跑剩" + 
				"下距離的一半，\n要過幾秒鐘才會跑到接近終點小於1公尺");
		double distance = 100;
		int time = 0;
		
		while(true) {
			distance /= 2;
			if(distance<1) {
				break;
			}
			time += 1;			
		}
		time += 1;
		System.out.println("答案: 要過"+time+"秒");
	}
}

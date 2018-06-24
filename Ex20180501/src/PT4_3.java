
public class PT4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(max3(3,5,20));
	}
	
	public static int max3(int x,int y,int z) {
		return PT4_1.max2(PT4_1.max2(x, y),z);
	}

}

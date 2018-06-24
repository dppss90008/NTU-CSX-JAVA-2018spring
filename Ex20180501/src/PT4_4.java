
public class PT4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(1,2));
		System.out.println(add(1,2,3));
		System.out.println(add(1,2,3,4));
		System.out.println(add(1.5,2.5));
		System.out.println(add(1.5,2.5,3.5));
		System.out.println(add(1.5,2.5,3.5,4.5));
	}
	
	public static int add(int x,int y) {
		return x+y;
	}
	public static int add(int x,int y,int z) {
		return x+y+z;
	}
	public static int add(int w,int x,int y,int z) {
		return w+x+y+z;
	}
	public static double add(double x,double y) {
		return x+y;
	}
	public static double add(double x,double y,double z) {
		return x+y+z;
	}
	public static double add(double w,double x,double y,double z) {
		return w+x+y+z;
	}
	

}

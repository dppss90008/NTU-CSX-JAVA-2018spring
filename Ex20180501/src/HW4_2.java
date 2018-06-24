
public class HW4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start_time = System.currentTimeMillis();
		System.out.println(Fibo(30));
		long end_time = System.currentTimeMillis();
		System.out.printf("遞迴寫法需耗費:%d毫秒\n",end_time-start_time);
		
		long start_time2 = System.currentTimeMillis();
		System.out.println(Fibo_loop(30));
		long end_time2 = System.currentTimeMillis();
		System.out.printf("迴圈寫法需耗費:%d毫秒\n",end_time2-start_time2);

		
		
		}
	
	public static int Fibo(int n) {
		if (n==1) return 0;
		if (n==2) return 1;
		return Fibo(n-1)+Fibo(n-2);
	}
	
	public static int Fibo_loop(int n) {
		int a1 = 0, a2 = 1, a3 = 1;
		int i;
		for(i=1;i<n;i++) {
			a1 = a2;
			a2 = a3;
			a3 = a1+a2;
		}
		return a1;
	}

}

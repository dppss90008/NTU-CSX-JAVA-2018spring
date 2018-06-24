
public class PT3_5 extends PT_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int Sum = 0;
		for (i = 1; i <= 10; i++) {
			System.out.print(i);
			if (i < 10) {
				System.out.print("+");
			}
			Sum += i;
		}
		System.out.print("=" + Sum);
	}

}

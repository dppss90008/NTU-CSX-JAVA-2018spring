public class Ex08 {
	public static void main(String[] args) {
		
		int[] A1 = { 1, 2, 3, 4 }; // 宣告一個int陣列，並初始化
		//int[] FirstArray = new int[]{1, 2, 3, 4};
//			int[] FirstArray;
//			FirstArray = new int[]{1, 2, 3, 4};
		int[] A2; // 宣告一個int陣列，但未初始化

		A2 = A1;
		
		System.out.print("最開始FirstArray的內容為：");
		PrintArray(A1);
		System.out.print("最開始SecondArray的內容為：");
		PrintArray(A2);
		
		A1[2] = 100; // 重新指定FirstArray第3個元系的值為100
		
		System.out.print("改變後FirstArray的內容為：");
		PrintArray(A1);
		System.out.print("改變後SecondArray的內容為：");
		PrintArray(A2);
	}

	public static void PrintArray(int[] ArrayName) {
		for (int i = 0; i < ArrayName.length; i++) {
			System.out.print(" " + ArrayName[i] + " ");
		}
		System.out.println();
	}

	

	
}

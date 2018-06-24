import java.util.Scanner;

public class HW5_4 {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		in.close();
		int n = 4;
		int ct = 1;
		
		int[][] matrix = {
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0}
		};
		int x = 0;
		int y = n-1;
		for(int i=0;i<n;i++) {
			if(matrix[x][y]==0) {
				matrix[x][y]=ct;
				ct+=1;
			}
			x+=1;
		}
		
		 1h
		
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}

}

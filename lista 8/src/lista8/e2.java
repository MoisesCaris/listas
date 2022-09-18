package lista8;

public class e2 {
	public static void main(String[] args) {
		int m1[][] = new int[5][5];
		int j = 0;
		for (int i = 0; i < 5; i++) {
			m1[i][j] = 1;
			j = j + 1;
		}
		for (int i = 0; i < 5; i++) {
			for (int h = 0; h < 5; h++) {
				System.out.print(m1[i][h]+"|");
			}
			System.out.println();
		}
	}
}

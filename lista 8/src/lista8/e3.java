package lista8;

import java.util.Scanner;

public class e3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float m1[][] = new float[4][4];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Escolha ume numero:");
				m1[i][j] = ler.nextInt();
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j > 0) {
					m1[i][j] *= m1[i][j - 1];
				}
			}
		}

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				if (j != 0) {
					m1[j][i] = m1[j - 1][i] * m1[j - 1][i];
				}
			}
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(m1[i][j] + " | ");
			}
			System.out.println();
		}
		ler.close();
	}
}
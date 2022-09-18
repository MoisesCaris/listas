package lista8;

import java.util.Scanner;

public class e4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int m1[][] = new int [4][4];
		int m = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println("Escolha ume numero:");
				m1[i][j] = ler.nextInt();
				if(m < m1[i][j]) {
					m = m1[i][j];
				}
			}
		}
		for (int i = 0; i < 4; i++) {
			for (int h = 0; h < 4; h++) {
				System.out.print(m1[i][h]+"|");
			}
			System.out.println();
		}
		for (int i = 0; i < 4; i++) {
			for (int h = 0; h < 4; h++) {
				if(m == m1[i][h]) {
					System.out.println("O maior numero foi encontrado na linha "+(i+1)+" e na coluna "+(h+1));
				}
			}
		}
		ler.close();
	}
}
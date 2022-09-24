package lista9;

import java.util.Scanner;

public class e2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int soma = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Escolha um numero");
				matriz[i][j] = ler.nextInt();
			}
		}
		soma = ((matriz[1][0] + matriz[2][0]) + matriz[2][1]);
		System.out.println("A soma da parte de baixo da diagonal foi " + soma);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + "|");
			}
			System.out.println();
		}
		ler.close();
	}
}

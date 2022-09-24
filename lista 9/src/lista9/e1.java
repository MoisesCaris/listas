package lista9;

import java.util.Scanner;

public class e1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int soma = 0, h = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("Escolha um numero");
				matriz[i][j] = ler.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			soma = soma + matriz[i][h];
			h++;
		}
		System.out.println("A soma da diagonal foi " + soma);
		ler.close();
	}
}
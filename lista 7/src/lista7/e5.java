package lista7;

import java.util.Scanner;

public class e5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, i, valor, c;
		System.out.println("Insira um número inteiro");
		n = ler.nextInt();

		for (i = 1; i <= n; i++) {
			valor = 1;
			System.out.print(valor);
			System.out.println("  ");

			if (n != 1) {
				for (i = 1; i < n; i++) {
					valor = 1;
					System.out.print(valor + " ");

					for (c = 1; c <= i; c++) {
						valor = (valor * (i - c + 1)) / c;
						System.out.print(valor + " ");
					}
					System.out.println("  ");
				}
			}
		}
		ler.close();
	}
}
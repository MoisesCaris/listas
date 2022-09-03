package lista6;

import java.util.Scanner;

public class e3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Escolha o numero " + (i + 1) + " da sequencia");
			n[i] = ler.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (n[i] == n[j]) {
					System.out.println("Os valores " + n[i] + " se repete");
				}
			}
		}
		ler.close();
	}
}
package lista6;

import java.util.Scanner;

public class e1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float n[] = new float[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Escolha um numero:");
			n[i] = ler.nextInt();
		}
		int n3 = 0, soma = 0;
		for (int i = 0; i < 10; i++) {
			if (n[i] < 0) {
				n3 = n3 + 1;
			}
			if (n[i] > 0) {
				soma = (int) (soma + n[i]);
			}
		}
		System.out.println("Teve " + n3 + " numeros negativos" + "\n" + "E a soma dos numeros positivos foi " + soma);
		ler.close();
	}
}
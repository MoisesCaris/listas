package lista7;

import java.util.Scanner;

public class e3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n[] = new int[6];
		int p[] = new int[6];
		int im[] = new int[6];
		int imp = 0, pa = 0;
		for (int i = 0; i < 6; i++) {
			System.out.println("Escolha um numero");
			n[i] = ler.nextInt();
			while (n[i] == 0) {
				System.out.println("Porfavor escolha um numero maior que zero");
				n[i] = ler.nextInt();
			}
			if (n[i] % 2 == 0) {
				p[i] = n[i];
			} else {
				im[i] = n[i];
				imp = imp + 1;
			}
		}
		for (int i = 0; i < 6; i++) {
			pa = p[i] + pa;
			if (p[i] != 0) {
				System.out.print(p[i] + " ");
			}
		}
		System.out.println("\n" + "A soma do soma dos pares foi " + pa);
		for (int i = 0; i < 6; i++) {
			if (im[i] != 0) {
				System.out.print(im[i] + " ");
			}
		}
		System.out.println("\n" + "Teve um total de " + imp + " Numeros impares");
		ler.close();
	}
}

package lista7;

import java.util.Scanner;

public class e1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];
		for (int i = 0; i < 3; i++) {
			System.out.println("Escolha um numero para a sequencia A");
			a[i] = ler.nextInt();
			System.out.println("Escolha um numero para a sequncia B");
			b[i] = ler.nextInt();
			c[i] = a[i] - (b[i] * a[i]);
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(c[i]);
		}
		ler.close();
	}
}
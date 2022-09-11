package lista7;

import java.util.Arrays;
import java.util.Scanner;

public class e4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int veta[] = new int[10];
		int vetb[] = new int[10];
		int n[] = new int[20];
		int aux = 0, k = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Escolha o numero " + (i + 1) + " da sequencia 1");
			veta[i] = ler.nextInt();
			while (veta[i] == 0) {
				System.out.println("Porfavor escolha um numero maior que 0");
				veta[i] = ler.nextInt();
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("Escolha o numero " + (i + 1) + " da sequencia 2");
			vetb[i] = ler.nextInt();
			while (vetb[i] == 0) {
				System.out.println("Porfavor escolha um numero maior que 0");
				vetb[i] = ler.nextInt();
			}
		}
		for (int i = 0; i < 10; i++) {
			n[k] = veta[i];
			k++;
			n[k] = vetb[i];
			k++;
		}
		Arrays.sort(n);//Só pra por o vetor em ordem crescente para deixar mais bonito
		for (int i = 0; i < 20; i++) {
			for (int j = i + 1; j < 20; j++) {
				if (n[i] == n[j]) {
					aux++;
				}
			}
			if (aux == 0) {
				System.out.println(n[i]);
			}
			aux = 0;
		}
		ler.close();
	}
}
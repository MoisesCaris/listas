package lista8;

import java.util.Scanner;

public class e5  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int m1[][] = new int [5][5];
		int rep = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println("Escolha ume numero:");
				m1[i][j] = ler.nextInt();
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int h = 0; h < 5; h++) {
				System.out.print(m1[i][h]+"|");
			}
			System.out.println();
		}
		System.out.println("Qual numero deseja procurar");
		int m = ler.nextInt();
		for (int i = 0; i < 5; i++) {
			for (int h = 0; h < 5; h++) {
				if(m == m1[i][h]) {
					System.out.println("O numero foi encontrado na linha "+(i+1)+" e na coluna "+(h+1));
				}
				else {
					rep = rep + 1;
				}
			}
		}
		if(rep == 25) {
			System.out.println("Não foi encontrado");
		}
		ler.close();
	}
}
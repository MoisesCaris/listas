package lista8;

import java.util.Scanner;

public class e1  {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int m1[][] = new int[4][4];
		int m10 = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println("Escolha ume numero:");
				m1[i][j] = ler.nextInt();		
			}
		}
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(m1[i][j] >= 10) {
					System.out.println(m1[i][j]);
					m10 = m10 + 1;
				}
			}
		}
		System.out.println("Foram exibidos:"+m10+" maiores ou iguais que 10");
		ler.close();
	}
}
package lista9;

import java.util.Scanner;

public class e4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int alunos[][] = new int[5][4];
		int m = 0, t = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 0) {
					System.out.println("Qual seu numero de matricula:");
					alunos[i][j] = ler.nextInt();
				}
				if (j == 1) {
					System.out.println("Qual a media dos trabalhos:");
					alunos[i][j] = ler.nextInt();
				}
				if (j == 2) {
					System.out.println("Qual a media das provas:");
					alunos[i][j] = ler.nextInt();
				}
				if (j == 3) {
					alunos[i][j] = ((alunos[i][1] + alunos[i][2]) / 2);
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					if (m < alunos[i][j]) {
						m = alunos[i][j];
						t = i;
					}
				}
			}
		}
		System.out.println("A maior nota foi do aluno de matricula " + alunos[t][0]);
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(alunos[i][j] + "|");
			}
			System.out.println();
		}
		ler.close();
	}
}
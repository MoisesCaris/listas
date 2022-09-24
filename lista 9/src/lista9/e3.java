package lista9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class e3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int cartelo[] = new int[25];
		int cartela[][] = new int[5][5];
		Random random = new Random();
		int randi = 0, b = 0;
		for (int i = 0; i < 25; i++) {
			randi = random.nextInt(100);
			cartelo[i] = randi;
		}
		Arrays.sort(cartelo);
		for (int i = 1; i < 25; i++) {
			if (cartelo[i] == cartelo[i - 1]) {
				cartelo[i] = cartelo[i] + 1;
			}
		}
		for (int h = 0; h < 5; h++) {
			for (int j = 0; j < 5; j++) {
				cartela[h][j] = cartelo[b];
				b++;
			}
		}
		System.out.println("Sua cartela é");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(cartela[i][j] + "|");
			}
			System.out.println();
		}
		ler.close();
	}
}

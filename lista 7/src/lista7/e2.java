package lista7;

public class e2 {
	public static void main(String[] args) {
		int seq[] = new int[100];
		int j = 0;
		for (int i = 0; i < seq.length; i++) {
			while(j % 7 ==0 || j % 10 == 7) {
				j = j + 1 ;
			}
			seq[i] = j;
			j = j + 1;
		}
		for (int i = 0; i < seq.length; i++) {
			System.out.println(seq[i]);
		}
	}
}

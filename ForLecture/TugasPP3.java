

import java.util.Scanner;

class TugasPP3 {
	public static void main(String[] args) {

		printTable(null, null, null);


		Scanner sc = new Scanner(System.in);

		
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Tidak ada banyak input yang nol/negatif");
			return;
		}

		
		String nama[] = new String[n];
	
		String nim[] = new String[n];

		int nilai[] = new int[n];

		for (int i = 0; i < n; i++) {
			nama[i] = readLine(sc);
			nim[i] = sc.next();
			nilai[i] = sc.nextInt();
		}

		printTable(nama, nim, nilai);
	}

	static String readLine(Scanner sc) {
		String s;
		do {
			s = sc.nextLine();
		} while (s.equals(""));
		return s;
	}


	static String rep(char c, int n) throws NegativeArraySizeException {
		char ch[] = new char[n];
		for (int i = 0; i < n; ch[i++] = c);
		return new String(ch);
	}


	static String buildHorizontalBorder(int nameLen, int idLen, int scoreLen) {
		return "+-" + rep('-', nameLen) + "-+-" + rep('-', idLen) + "-+-" + rep('-', scoreLen) + "-+";
	}

	static void printTable(String nama[], String nim[], int score[]) {

		if (nama != null)
			assert (nama.length == nim.length && nim.length == score.length);

		int nameLen = 4; 
		int idLen = 3;
		int scoreLen = 5;
		String nilaitr[] = null; 

		if (nama != null) {
			nilaitr = new String[score.length];

			for (int i = 0; i < nama.length; i++) {
				nameLen = Math.max(nameLen, nama[i].length());
				idLen = Math.max(idLen, nim[i].length());

				String scoreAsString = String.format("%d", score[i]);
				nilaitr[i] = scoreAsString;
				scoreLen = Math.max(scoreLen, scoreAsString.length());
			}
		}

		String tableFormat = String.format("| %%-%ds | %%-%ds | %%-%ds |\n", nameLen, idLen, scoreLen);
		String border = buildHorizontalBorder(nameLen, idLen, scoreLen);
		System.out.println(border);
		System.out.printf(tableFormat, "Nama", "NIM", "Nilai");
		System.out.println(border);

		if (nama != null && nama.length > 0) {
			for (int i = 0; i < nama.length; i++)
				System.out.printf(tableFormat, nama[i], nim[i], nilaitr[i]);
			System.out.println(border);
		}
	}
}

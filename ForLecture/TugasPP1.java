import java.util.Scanner;

class TugasPP1 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String str[] = new String[n];

		for (int i = 0; i < n; i++) {
			int wrap = sc.nextInt();
			char s[] = sc.next().toCharArray();
			for (int j = 0; j < s.length; j++)
				s[j] = rotChar(s[j], wrap);
			str[i] = new String(s);
		}

		System.out.println(concat(str));
	}

	static char rotChar(char ch, int n) {
		n = Math.floorMod(n, 26);

		if (ch >= 'A' && ch <= 'Z') {
			return (char) (Math.floorMod(ch - 'A' + n, 26) + 'A');
		} else if (ch >= 'a' && ch <= 'z') {
			return (char) (Math.floorMod(ch - 'a' + n, 26) + 'a');
		}
		return ch;
	}

	static String concat(String s[]) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length; i++) {
			sb.append(s[i]);
			if (i < s.length - 1)
				sb.append(' ');
		}

		return sb.toString();
	}
}

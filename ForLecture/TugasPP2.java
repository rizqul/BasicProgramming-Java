import java.util.Scanner;

class TugasPP2 {
	
	static boolean syarat1(String calonPassword) {
		
		int len = calonPassword.length();
		// syarat pertama = panjang
		if (len >= 6 && len <= 30)
			return true;
		
		System.out.println("Panjang harus 6-30");
		return false;
	}

	// Syarat kedua = ada huruf kapital dan huruf kecil
	static boolean syarat2(String calonPassword) {
		if (calonPassword.matches(".*[A-Z].*") && calonPassword.matches(".*[a-z].*"))
			return true;

		System.out.println("Harus memiliki setidaknya 1 huruf kapital & huruf kecil");
		return false;
	}

	// Syarat ketiga = ada angka
	static boolean syarat3(String calonPassword) {
		// [0-9] = cocok dengan angka 0 s/d 9
		if (calonPassword.matches(".*[0-9].*"))
			return true;
		
		System.out.println("Harus memiliki setidaknya 1 angka");
		return false;
	}

	// Syarat keempat = tidak boleh simbol
	static boolean syarat4(String calonPassword) {
		if (calonPassword.matches(".*\\W.*")) {
			System.out.println("Tidak boleh memiliki simbol");
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		int len = password.length();

		if (
			syarat1(password) &&
			syarat2(password) &&
			syarat3(password) &&
			syarat4(password)
		)
			System.out.println("Password available");
	}
}

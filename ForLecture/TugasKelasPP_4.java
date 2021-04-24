import java.util.Scanner;

public class TugasKelasPP_4{
    public static void main(String[] args) {
        System.out.println(">>> Program matrix ordo 3x3 <<<");
        Scanner sc = new Scanner(System.in);
        System.out.print("Pilih operasi matrix  \n1.Perkalian matrix\n2.Determinan matrix\n");
        int angka = sc.nextInt();
        switch(angka){
        case 1:
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        System.out.println("Masukkan matrix 1 = ");
		for(int i=0 ; i<3 ; i++){
			for(int j=0 ; j<3 ; j++){
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Masukkan matrix 2 = ");
		for(int i=0 ; i<3 ; i++){
			for(int j=0 ; j<3 ; j++){
				arr2[i][j] = sc.nextInt();
			}
		}
		printArray(arr1);
		System.out.println("dikali dengan");
		printArray(arr2);
		System.out.println("Hasilnya");
		int baris1 = arr1.length;
		int baris2 = arr2.length;
		int kolom1 = arr1[0].length;
		int kolom2 = arr2[0].length;
		
		int hasilKali[][] = new int[baris1][kolom2];
		int sum;
		for(int i=0 ; i<baris1 ; i++){
			for(int j=0 ; j<kolom2 ; j++){
				sum=0;
				for(int k=0 ; k<kolom1 ; k++){
					sum += arr1[i][k]*arr2[k][j];
				}
				hasilKali[i][j]=sum;
			}
		}
		printArray(hasilKali);
		
        break;
        case 2 :
        int a,b;
        int o = 3;
        int matrix3[][] = new int [3][3];
        System.out.println("\nMatrix ordo ");
            for(a=0 ; a<o ; a++){
                for(b=0 ; b<o ; b++){
                    matrix3 [a][b]=sc.nextInt();
                }
            }
            int x=(matrix3[0][0] * (matrix3[1][1] * matrix3[2][2] - matrix3[1][2] * matrix3[2][1]));
            int y=(matrix3[0][1] * (matrix3[1][0] * matrix3[2][2] - matrix3[1][2] * matrix3[2][0]));
            int z=(matrix3[0][2] * (matrix3[1][0] * matrix3[2][1] - matrix3[1][1] * matrix3[2][0]));
            int determinan= x - y + z;
            System.out.printf("Determinan matrix  = %s",determinan);
	    }
            }
	private static void printArray(int[][] arr){
		int baris = arr.length;
		int kolom = arr[0].length;
		for(int i=0 ; i<arr.length ; i++){
			System.out.print("[");
			for(int j=0 ; j<arr[0].length ; j++){
				System.out.print(arr[i][j]);
				if(j<kolom-1){
					System.out.print(", ");
				}else{
					System.out.print("]");
				}
			}
			System.out.print("\n");
		}
	}
}
import java.util.Scanner;

public class ArrayNilai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];
        int jumlahLulus = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-" + i + " adalah " + nilaiAkhir[i]);
            if (nilaiAkhir[i] > 70) {
                jumlahLulus++;
            }
        }
        
        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);
    }
}

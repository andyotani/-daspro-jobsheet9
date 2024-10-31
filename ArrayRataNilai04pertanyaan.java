import java.util.Scanner;

public class ArrayRataNilai04pertanyaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        int[] nilaiAkhir = new int[jumlahMahasiswa];

        int jumlahLulus = 0;
        int totalNilaiLulus = 0;
        int jumlahTidakLulus = 0;
        int totalNilaiTidakLulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();

            if (nilaiAkhir[i] > 70) {
                totalNilaiLulus += nilaiAkhir[i];
                jumlahLulus++;
            } else {
                totalNilaiTidakLulus += nilaiAkhir[i];
                jumlahTidakLulus++;
            }
        }

        double rataRataLulus = jumlahLulus > 0 ? (double) totalNilaiLulus / jumlahLulus : 0;
        double rataRataTidakLulus = jumlahTidakLulus > 0 ? (double) totalNilaiTidakLulus / jumlahTidakLulus : 0;

        System.out.println("Rata-rata nilai lulus = " + rataRataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataRataTidakLulus);
    }
}

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlahMahasiswa = sc.nextInt();
        
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
        }
        
        int total = 0;
        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];
        
        System.out.println("Nilai-nilai mahasiswa yang telah dimasukkan:");
        for (int nilai : nilaiMahasiswa) {
            System.out.println(nilai);
            total += nilai;
            
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }
        
        double rataRata = (double) total / jumlahMahasiswa;
        
        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
    }
}

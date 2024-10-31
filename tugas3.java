import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] menu = {
            "Nasi Goreng", 
            "Mie Goreng", 
            "Roti Bakar", 
            "Kentang Goreng", 
            "Teh Tarik", 
            "Cappuccino", 
            "Chocolate Ice"
        };

        

        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = scanner.nextLine();

        boolean ditemukan = linearSearch(menu, makananDicari);

        if (ditemukan) {
            System.out.println(makananDicari + " tersedia di menu.");
        } else {
            System.out.println(makananDicari + " tidak ada di menu.");
        }
    
    }

    public static boolean linearSearch(String[] menu, String makanan) {
        for (String item : menu) {
            if (item.equalsIgnoreCase(makanan)) {
                return true;
            }
        }
        return false;
    }
}

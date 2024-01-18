import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan nama: ");
            String namaPemesan = input.nextLine();

            System.out.println("Pilihan: " +
                    "1. Nasi Goreng (Rp.15.000.00) " +
                    "2. Mie Ayam (Rp.10.000.00) " +
                    "3. Bakso (Rp.13.000.00)");

            System.out.print("Masukkan Pilihan: ");
            int pilihanMenu = input.nextInt();

            int harga = 0;
            String pesanan = "";

            switch (pilihanMenu) {
                case 1:
                    harga = 15000;
                    pesanan = "Nasi Goreng";
                    break;
                case 2:
                    harga = 10000;
                    pesanan = "Mie Ayam";
                    break;
                case 3:
                    harga = 13000;
                    pesanan = "Bakso";
                    break;
                default:
                    System.out.println("Salah Pilih ! :(");
                    continue;
            }

            System.out.print("Jumlah pesanan: ");
            int jumlahPesan = input.nextInt();

            System.out.println("#=====================================#");
            System.out.println("Nama Pemesan: " + namaPemesan);
            System.out.println("Pesanan: " + pesanan);
            System.out.println("Harga: Rp." + harga);
            System.out.println("Jumlah Pesan: " + jumlahPesan);

            int totalBayar = harga * jumlahPesan;
            System.out.println("Total Bayar: " + totalBayar + "\n");

            System.out.print("Ingin memesan lagi? (y/n): ");
            String lanjutkan = input.next();

            System.out.println("#=====================================#");

            if (!lanjutkan.toLowerCase().equals("y")) {
                break;
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat Scanner untuk class Pemilik
        Pemilik a = new Pemilik();
        Scanner Pemilik = new Scanner(System.in);
        // Tampilkan output ke user
        System.out.println(" ### PEMILIK DVD ### ");
        // Membuat Scanner untuk class Penyewa
        Penyewa b = new Penyewa();
        Scanner Penyewa = new Scanner(System.in);
        // Menampilkan String yg sudah disimpan
        DVD c = new Transaksi();
        Transaksi d = new Transaksi();

        System.out.println(" Nama  : ");
        a.nama_pemilik = Pemilik.nextLine();
        // Tampilkan output lagi
        System.out.println(" No Hp : ");
        a.no_hp = Pemilik.nextLine();
        System.out.println(" Id : ");
        a.id = Pemilik.nextInt();
        System.out.println("-------------------------");
        System.out.println(" ### PENYEWA DVD ### ");
        System.out.println(" Nama Lengkap  : ");
        b.nama_lengkap = Penyewa.nextLine();
        // Tampilkan output lagi
        System.out.println(" No Hp : ");
        b.no_hp = Penyewa.nextLine();
        System.out.println(" Alamat: ");
        b.alamat= Penyewa.nextLine();
        System.out.println("-------------------------");
       int total = c.Jenis_DVD();

        System.out.println("Harga Total adalah : "+ c.Hitung(total));
    }
}
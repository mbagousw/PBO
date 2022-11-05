import java.util.Scanner;
public class Transaksi extends DVD{
    int lama_sewa;
    int harga;

    @Override
    public int Hitung(int total){
        return total;
    }
    @Override
    public int Jenis_DVD(){
        int pil;
        int lama = 0;
        int a = 0;
        int total = 0;
        Scanner in = new Scanner(System.in);
        System.out.println(" 1. DVD-R");
        System.out.println(" 2. DVD-RW");
        System.out.println(" 3. DVD+R");
        System.out.println("Massukkan pilihan : ");
        pil=in.nextInt();
        switch (pil){
            case 1:
                a = 5000;
                System.out.println("DVD-R");
                System.out.println("Masukkan lama sewa : ");
                lama = in.nextInt();
                setLama_sewa(lama);
                setHarga(a);
                total = a*lama;
                break;
            case 2:
                a = 6000;
                System.out.println("DVD-RW");
                System.out.println("Masukkan lama sewa : ");
                lama = in.nextInt();
                setLama_sewa(lama);
                setHarga(a);
                total = a*lama;
                break;
            case 3:
                a = 7000;
                System.out.println("DVD+R");
                System.out.println("Masukkan lama sewa : ");
                lama = in.nextInt();
                setLama_sewa(lama);
                setHarga(a);
                total = a*lama;
                break;
        }
        return total;
    }
    public void bayar(){
        System.out.println("");
    }

    public int getLama_sewa() {
        return lama_sewa;
    }

    public int setLama_sewa(int lama_sewa) {
        this.lama_sewa = lama_sewa;
        return lama_sewa;
    }

    public int getHarga() {
        return harga;
    }

    public int setHarga(int harga) {
        this.harga = harga;
        return harga;
    }
}

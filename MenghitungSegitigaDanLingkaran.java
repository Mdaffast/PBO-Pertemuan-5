import java.util.Scanner;

public class MenghitungSegitigaDanLingkaran {

    public static void main(String[] args) {

        String ulang;
        Scanner cek = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("=============================================================");
        System.out.println("Selamat datang di program menghitung Segitiga Dan Lingkaran");
        do {
            System.out.println("=============================================================");
            System.out.println("Menghitung luas Segitiga");
            System.out.print("Alasnya berapa? = ");
            double alas = input.nextDouble();

            System.out.print("Tingginya berapa? = ");
            double tinggi = input.nextDouble();

            double segitiga = (0.5 * alas * tinggi);
            System.out.println("Luas Segitiga =  " + segitiga);

            System.out.println("Menghitung luas lingkaran");
            System.out.print("Jari-Jarinya berapa? = ");
            double r = input.nextDouble();

            double phi = 3.14;
            double lingkaran = (phi * (r * r));
            System.out.println("Luas lingkaran = " + lingkaran);

            System.out.println("=============================================================");
            System.out.print("Apakah kamu ingin menghitung lagi? [y/t]? ");
            ulang = cek.next();
            System.out.println("  ");

        } while (ulang.equals("y") || ulang.equals("Y"));
        System.out.println("=============================================================");
        System.out.println("Terima kasih telah menggunakan program ini");
        System.out.println("=============================================================");
    }

}

package tugasperpus;

import java.util.Scanner;

public class mainperpus {

    public static void main(String[] args) {
        library perpus = new library();
        Scanner sc = new Scanner(System.in);
        boolean ulangi = true;

        System.out.println("********************************************");
        System.out.println("*               PERPUSTAKAAN               *");
        System.out.println("********************************************\n");

        do {
            System.out.println("SELAMAT DATANG DI PERPUSTAKAAN SI-C\n");
            System.out.println("============================================\n");

            System.out.println("Terdapat beberapa kategori buku di perpustakaan ini, yaitu:\n");
            System.out.println("1. Teknologi");
            System.out.println("2. Filsafat");
            System.out.println("3. Sejarah");
            System.out.println("4. Agama");
            System.out.println("5. Psikologi");
            System.out.println("6. Politik");
            System.out.println("7. Fiksi\n");
            System.out.print("Silahkan masukkan kode kategori buku yang ingin Anda cari: ");

            int kode = sc.nextInt();
            String informasiBuku = perpus.getInformasiBuku(kode);
            System.out.println(informasiBuku);

            System.out.println("apakaha anda ingin mencari buku lagi? (ya/tidak)");
            String jawab = sc.next();
            ulangi = jawab.equalsIgnoreCase("ya");
            if (!ulangi) {
                System.out.println("\nTerima kasih atas kunjungan Anda!");
            }
        } while (ulangi);

        sc.close();

    }
}

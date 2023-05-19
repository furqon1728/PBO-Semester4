package praktikum.pertemuan9;

import java.util.Scanner;

public class pernyataanForGenap {
    public static void main(String[] args) {
        Scanner inputN = new Scanner(System.in);

        System.out.println("Menampilkan Bilangan Genap\n");

        System.out.print("Bilangan Awal\t: ");
        int nAwal = inputN.nextInt();
        System.out.print("Bilangan Akhir\t: ");
        int nAkhir = inputN.nextInt();

        System.out.println("\nBilangan Genap antara " + nAwal + " Sampai " + nAkhir + " :");

        for (int i = nAwal; i <= nAkhir; i++){
//            mengetahui nilai genap menggunakan modulus
//            jika bilangan awal dibagi 2 tidak memiliki sisa atau 0, maka dia termasuk nilai bilangan genap
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}

package praktikum.pertemuan9;

import java.util.Scanner;

public class pernyataanWhileGenap {
    public static void main(String[] args) {
        Scanner inputN = new Scanner(System.in);

        System.out.println("Menampilkan Bilangan Genap\n");

        System.out.print("Bilangan Awal\t: ");
        int nAwal = inputN.nextInt();
        System.out.print("Bilangan Akhir\t: ");
        int nAkhir = inputN.nextInt();

        System.out.println("\nBilangan Genap antara " + nAwal + " Sampai " + nAkhir + " :");

        int i = nAwal;
        while (i <= nAkhir){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}

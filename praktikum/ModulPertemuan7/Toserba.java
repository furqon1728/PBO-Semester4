package praktikum.ModulPertemuan7;

import java.util.Scanner;

public class Toserba {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int jumItemBarang=0;
        int total_bayar=0;

        String [] kode = new String[5];
        int [] jumBeli = new int[5];
        int [] harga = new int[5];
        int [] sub_total = new int[5];
        String [] barang = new String[5];

        System.out.println("\nTOKO SERBA ADA\n***************");
        System.out.print("Masukan Item Barang  : ");
        jumItemBarang=input.nextInt();
        System.out.println(" ");

        for (int i=0; i<jumItemBarang;i++){
            System.out.print("Data Ke-"+(i+1)+"\nMasukkan Kode        : ");
            kode[i]=input.next();
            System.out.print("Masukkan jumlah beli : ");
            jumBeli[i]=input.nextInt();

            switch (kode[i]){
                case "a001" :
                    barang[i]="Buku     ";
                    harga[i]=3000;
                    break;
                case "a002" :
                    barang[i]="Pensil   ";
                    harga[i]=4000;
                    break;
                case "a003" :
                    barang[i]="Pulpen   ";
                    harga[i]=5000;
                    break;
                default :
                    System.out.println("Kode Barang Tidak Tersedia");
            }
        }

        System.out.println("\n\nTOKO SERBA ADA\n*******************");
        System.out.println("=======================================================================");
        System.out.println("No\t" + "Kode Barang\t\t" + "Nama Barang\t\t" + "Harga\t" + "Jumlah Beli\t\t" + "Jumlah Bayar");
        System.out.println("=======================================================================");

        for (int i=0; i<jumItemBarang;i++){
            sub_total[i]=((jumBeli[i]*harga[i]));
            total_bayar+=sub_total[i];
            System.out.println(i+1 +"\t"+kode[i]+"\t\t\t"+barang[i]+"\t\t"+harga[i]+"\t\t"+jumBeli[i]+"\t\t\t"+sub_total[i]);
        }

        System.out.println("=========================================================================");
        System.out.println("Total Bayar \t\t\t\t\t\t\t\t"+total_bayar);
        System.out.println("=========================================================================");
    }
}

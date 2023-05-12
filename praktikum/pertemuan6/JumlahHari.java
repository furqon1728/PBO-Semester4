package praktikum.pertemuan6;

import java.util.Scanner;

public class JumlahHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tahun : ");
        int inputTahun = input.nextInt();

        System.out.print("Masukkan Bulan : ");
        int inputBulan = input.nextInt();

//        karena jumlah bulan hanya 12, maka program akan berhenti jika input > 12
        if (inputBulan > 12){
            System.out.println("Jumlah bulan hanya 12 saja!!" );
            System.out.println(System.err);
            System.exit(0);
        }

//saya membagi bulan menjadi bulan genap dan ganjil, jika inputBulan dibagi 2 habis, maka dia termasuk bulan genap
// jika tidak maka dia termasuk bulan ganjil
        int jumlahHari = inputBulan % 2;

        switch (jumlahHari){
            case 0:
//                jika dia bulan ke-2 atau bulan februari dan termasuk kedalam tahun kabisat, maka dia 29 hari, jika tidak maka 28 hari
//                jika dia termasuk bulan genap dari bulan 4 - 6 maka ada 30 hari, bulan genap setelah itu memilik 31 hari
                if ( ( inputBulan == 2 && ( (inputTahun % 400) == 0 || ( (inputTahun %4 == 0)  && (inputTahun % 100) !=0 )  ))){
                    System.out.println("Jumlah hari pada tahun " + inputTahun + " bulan " + inputBulan + " adalah 29 hari");
                } else if (( inputBulan == 2 && (inputTahun % 400) != 0 || ( (inputTahun %4 != 0)  && (inputTahun % 100) ==0  ))) {
                    System.out.println("Jumlah hari pada tahun " + inputTahun + " bulan " + inputBulan + " adalah 28 hari");
                } else if ( (inputBulan == 8) || (inputBulan == 10) || (inputBulan == 12) ) {
                    System.out.println("Jumlah hari pada tahun " + inputTahun + " bulan " + inputBulan + " adalah 31 hari");
                } else {
                    System.out.println("Jumlah hari pada tahun " + inputTahun + " bulan " + inputBulan + " adalah 30 hari");
                }
                break;
            case 1:
//                jika dia bulan ganjil diatas 7 atau dia termasuk bulan 9 dan 11 maka, dia memilki 30 hari
                if ( (inputBulan == 9) || (inputBulan == 11)){
                System.out.println("Jumlah hari pada tahun " + inputTahun + " bulan " + inputBulan + " adalah 30 hari");
                }else {
                System.out.println("Jumlah hari pada tahun " + inputTahun + " bulan " + inputBulan + " adalah 31 hari");
                }
                break;

        }

    }
}

package praktikum.pertemuan6;

import java.util.Scanner;

public class Matematika {
    Scanner input = new Scanner(System.in);
    public void perkalian(){
        System.out.print("Masukkan Angka Pertama : ");
        int a = input.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        int b = input.nextInt();
        int hasil = a * b;
        System.out.println("\nHasil Perkalian antara " + a + " dan " + b + " adalah " + hasil);
    }

    public void pembagian(){
        System.out.print("Masukkan Angka Pertama : ");
        int a = input.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        int b = input.nextInt();
        int hasil = a / b;
        System.out.println("\nHasil Pembagian antara " + a + " dan " + b + " adalah " + hasil);
    }

    public void pertambahan(){
        System.out.print("Masukkan Angka Pertama : ");
        int a = input.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        int b = input.nextInt();
        int hasil = a + b;
        System.out.println("\nHasil Pertambahan antara " + a + " dan " + b + " adalah " + hasil);
    }

    public void pengurangan(){
        System.out.print("Masukkan Angka Pertama : ");
        int a = input.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        int b = input.nextInt();
        int hasil = a - b;
        System.out.println("\nHasil Pengurangan antara " + a + " dan " + b + " adalah " + hasil);
    }
    public void opsiHitung(){
        System.out.println("\nMenu Aplikasi Matematika : ");
        System.out.println("1. Pertambahan  2. Pengurangan  3. Perkalian  4. Pembagian");
        System.out.print("\nPilih Menu = ");
        int pilihan = input.nextInt();
        if (pilihan == 1){
            pertambahan();
        } else if (pilihan == 2) {
            pengurangan();
        } else if (pilihan == 3) {
            perkalian();
        } else if (pilihan == 4) {
            pembagian();
        }else {
            System.out.println("Tidak ada dalam opsi");
            System.out.println(System.err);
        }
    }
}

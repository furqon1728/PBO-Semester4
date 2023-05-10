package praktikum.pertemuan6;

import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai alas : ");
        double alas = input.nextDouble();

        System.out.print("Masukkan nilai tinggi : ");
        double tinggi = input.nextDouble();

        double luas = (alas*tinggi)/2;
        System.out.println("Luas Segitiga : " + luas);
    }
}

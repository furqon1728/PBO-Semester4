package praktikum.prakPertemuan6;

import java.util.Scanner;

public class Perkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = input.nextInt();

        System.out.println("Hasil perkalian: " + (bilangan1 * bilangan2));
    }
}

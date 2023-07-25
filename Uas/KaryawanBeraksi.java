package Uas;

import java.util.Scanner;

public class KaryawanBeraksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama karyawan: ");
        String namaKaryawan = scanner.nextLine();

        System.out.print("Apakah karyawan tetap atau kontrak? (T/K): ");
        String tipeKaryawan = scanner.nextLine();

        if (tipeKaryawan.equalsIgnoreCase("T")) {
            System.out.print("Masukkan golongan karyawan (1-6): ");
            int golongan = scanner.nextInt();

            System.out.print("Masukkan jumlah baju yang dihasilkan: ");
            int jumlahBaju = scanner.nextInt();

            KaryawanTetap karyawanTetap = new KaryawanTetap(namaKaryawan, golongan, jumlahBaju);
            tampilkanGaji(karyawanTetap);
        } else if (tipeKaryawan.equalsIgnoreCase("K")) {
            System.out.print("Masukkan jumlah kehadiran kerja: ");
            int jumlahKehadiran = scanner.nextInt();

            System.out.print("Masukkan jumlah kaos yang diproduksi: ");
            int jumlahKaos = scanner.nextInt();

            KaryawanKontrak karyawanKontrak = new KaryawanKontrak (namaKaryawan, jumlahKehadiran, jumlahKaos);
            tampilkanGaji(karyawanKontrak);
        } else {
            System.out.println("Input tidak valid.");
        }
    }

    public static void tampilkanGaji(Karyawan karyawan) {
        int gaji = karyawan.hitungGaji();
        System.out.println("Gaji	" + karyawan.nama + ": Rp"+ gaji);
    }

}

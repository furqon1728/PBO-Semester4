package praktikum.pertemuan6;

import java.util.Scanner;

public class Mahasiswa1 {
    String nim, nama;
    double nilAbsen, nilTugas, nilUts, nilUas, nilAkhir;
    public double getNilAbsen() {
        return nilAbsen;
    }
    public double getNilTugas() {
        return nilTugas;
    }
    public double getNilUts() {
        return nilUts;
    }
    public double getNilUas() {
        return nilUas;
    }
    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }

    public double getNilAkhir() {
        return nilAkhir;
    }

    public void NilaiAkhir(String nama, String nim, double nilAbsen, double nilTugas, double nilUts, double nilUas, double nilAkhir){

        Scanner input = new Scanner(System.in);

        System.out.print("NPM\t\t\t\t: ");
        this.nim = input.nextLine();
        nim = getNim();

        System.out.print("Nama Mahasiswa\t: ");
        this.nama = input.nextLine();
        nim = getNama();

        System.out.print("Nilai Kehadiran\t: ");
        this.nilAbsen= input.nextDouble();
        nilAbsen = getNilAbsen();

        System.out.print("Nilai Tugas\t\t: ");
        this.nilTugas = input.nextDouble();
        nilTugas = getNilTugas();

        System.out.print("Nilai UTS\t\t: ");
        this.nilUts = input.nextDouble();
        nilUas = getNilUts();

        System.out.print("Nilai UAS\t\t: ");
        this.nilUas = input.nextDouble();
        nilUas = getNilUas();

        nilAkhir = (0.1 * nilAbsen) + (0.2 * nilTugas) + (0.3 * nilUts) + (0.4 * nilUas);
        System.out.println("Nilai Akhir\t\t: " + nilAkhir);

    }


}

package Uas;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        MahasiswaBelumBeraksi obj = new MahasiswaBelumBeraksi();
        obj.cetakNama();
        obj.nilaiAkhir(90, 80, 80, 90);
        System.out.println("Nilai Akhir\t: " + obj.nilaiAkhir);
    }
}

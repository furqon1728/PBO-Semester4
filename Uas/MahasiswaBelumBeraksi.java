package Uas;

public class MahasiswaBelumBeraksi {
    String nim = "2110631", nama = "Jajang";
    double absen, tugas, uts, uas, nilaiAkhir;
    void cetakNama(){
        System.out.println("NIM\t\t: " + nim);
        System.out.println("NAMA\t: " + nama);
    }
    double nilaiAkhir(double absen, double tugas, double uts, double uas){
        this.absen = absen;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;

        nilaiAkhir = (absen + tugas + uts + uas) /4;
        return nilaiAkhir;
    }
}

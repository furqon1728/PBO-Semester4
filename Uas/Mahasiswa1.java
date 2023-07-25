package Uas;

public class Mahasiswa1 {
    double nilaiAbsen, nilaiTugas, nilaiUts, nilaiUas, NA;
    char grade;

    double NilaiAkhir(double nilaiAbsen, double nilaiTugas,double nilaiUts, double nilaiUas){
        this.nilaiAbsen = nilaiAbsen;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
        NA = (nilaiAbsen*0.1) + (nilaiTugas*0.2) + (nilaiUts*0.3) + (nilaiUas*0.4);
        return NA;
    }
}

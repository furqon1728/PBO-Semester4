package praktikum.pertemuan3;
public class Nilai {
//    membuat konstruktor
    int hAbsen, hTugas, hUts,hUas;
    public Nilai(int hAbsen, int hTugas, int hUts, int hUas){
        this.hAbsen = hAbsen;
        this.hTugas = hTugas;
        this.hUts = hUts;
        this.hUas = hUas;
    }

    public void nilai(){
        String nama,nim;

        nama = "Nauval Dwi Rivalfakhri";
        nim = "2110631250060";
        System.out.println("NIM\t\t\t\t:" + nim);
        System.out.println("Nama\t\t\t:" + nama);
    }

    public void cetakNilai(){
        double absen, tugas, uts, uas, jumNilai;

        absen = hAbsen * 0.1;
        tugas = hTugas * 0.2;
        uts = hUts * 0.3;
        uas = hUas * 0.4;

        jumNilai = absen + tugas + uts + uas;
        int nilaiAkhir = (int) jumNilai;

        System.out.println("Nilai Absen\t\t:" + absen);
        System.out.println("Nilai Tugas\t\t:" + tugas);
        System.out.println("Nilai UTS\t\t:" + uts);
        System.out.println("Nilai UAS\t\t:" + uas);
        System.out.println("Nilai Akhir\t\t:" + nilaiAkhir);
    }

}

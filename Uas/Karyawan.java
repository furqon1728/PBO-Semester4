package Uas;

public class Karyawan {
    public String nama;
    public int gaji;

    public Karyawan(String nama) {
        this.nama = nama;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int hitungGaji() {
        return gaji;
    }
}

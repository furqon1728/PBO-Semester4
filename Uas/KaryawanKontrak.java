package Uas;

public class KaryawanKontrak extends Karyawan{
    private int jumlahKehadiran;
    private int jumlahKaos;

    public KaryawanKontrak(String nama, int jumlahKehadiran, int jumlahKaos) {
        super(nama);
        this.jumlahKehadiran = jumlahKehadiran;
        this.jumlahKaos = jumlahKaos;
    }

    @Override
    public int hitungGaji() {
        int gajiPerKehadiran = 50000;
        int bonusKaos = 7000 * jumlahKaos;
        int gajiBersih = gajiPerKehadiran * jumlahKehadiran + bonusKaos;
        return gajiBersih;
    }

}

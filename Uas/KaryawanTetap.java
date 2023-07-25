package Uas;

public class KaryawanTetap extends Karyawan{
    private int golongan;
    private int jumlahBaju;

    public KaryawanTetap(String nama, int golongan, int jumlahBaju) {
        super(nama);
        this.golongan = golongan;
        this.jumlahBaju = jumlahBaju;
    }

    @Override
    public int hitungGaji() {
        int gajiPokok = 0;
        switch (golongan) {
            case 1:
                gajiPokok = 3000000;
                break;
            case 2:
                gajiPokok = 3500000;
                break;
            case 3:
                gajiPokok = 4000000;
                break;
            case 4:
                gajiPokok = 4500000;
                break;
            case 5:
                gajiPokok = 5000000;
                break;
            case 6:
                gajiPokok = 5500000;
                break;
            default:
                System.out.println("Golongan tidak valid.");
                break;
        }

        int bonusBaju = 10000 * jumlahBaju;
        int gajiBersih = gajiPokok + bonusBaju;
        return gajiBersih;
    }

}

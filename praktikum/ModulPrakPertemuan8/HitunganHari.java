package praktikum.ModulPrakPertemuan8;

import javax.swing.*;

public class HitunganHari extends JFrame {
    String inputBulan;
    int bulan;
    int cekHari;
    int jumlahHari;
    int cekBulan(){
        switch (inputBulan){
            case "Januari":
                bulan = 1;
                break;
            case "Februari":
                bulan = 2;
                break;
            case "Maret":
                bulan = 3;
                break;
            case "April":
                bulan = 4;
                break;
            case "Mei":
                bulan = 5;
                break;
            case "Juni":
                bulan = 6;
                break;
            case "Juli":
                bulan = 7;
                break;
            case "Agustus":
                bulan = 8;
                break;
            case "September":
                bulan = 9;
                break;
            case "Oktober":
                bulan = 10;
                break;
            case "November":
                bulan = 11;
                break;
            case "Desember":
                bulan = 12;
                break;
        }
        return bulan;
    }
    int hitung(int tahun){
        cekHari = bulan % 2;
        switch (cekHari){
            case 0:
                if (( bulan == 2 && ( (tahun % 400) == 0 || ( (tahun %4 == 0)  && (tahun % 100) !=0 )  ))){
                    jumlahHari = 29;
                } else if (( bulan == 2 && (tahun % 400) != 0 || ( (tahun %4 != 0)  && (tahun % 100) ==0  ))) {
                    jumlahHari = 28;
                } else if ((bulan == 8) || (bulan == 10) || (bulan == 12)) {
                    jumlahHari = 31;
                } else{
                    jumlahHari = 30;
                }
                break;
            case 1:
                if ((bulan == 9) || (bulan == 11)){
                    jumlahHari = 30;
                }else {
                    jumlahHari = 31;
                }
                break;
        }
        return jumlahHari;
    }
}

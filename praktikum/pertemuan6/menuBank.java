package praktikum.pertemuan6;
import java.util.Scanner;

public class menuBank {
    public int saldo = 250_000;
    public int getSaldo(){
        return saldo;
    }
    Scanner masukkan = new Scanner(System.in);
    public void cekSaldo(){
        System.out.println("Saldo Anda : Rp." + getSaldo());
        System.out.println("");
    }
    public void simpanUang(){
        System.out.print("Simpan Uang : Rp.");
        int uangDiSimpan = masukkan.nextInt();
        if (uangDiSimpan >= 50_000){
            saldo = getSaldo() + uangDiSimpan;
            cekSaldo();
            System.out.println("");
        }else {
            System.out.println("Uang Disetor dibawah Minimum Penyetoran!!!" + System.err);
            System.out.println("");
        }
    }
    public void ambilUang(){
        System.out.print("Ambil Uang : Rp.");
        int uangDiAmbil = masukkan.nextInt();
        saldo = getSaldo() - uangDiAmbil;
        cekSaldo();
        System.out.println("");
    }

}

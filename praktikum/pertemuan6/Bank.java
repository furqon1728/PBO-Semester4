package praktikum.pertemuan6;
import java.util.Scanner;

public class Bank {
   public int saldo = 100_000;
    public int getSaldo() {
        return saldo;
    }

    Scanner input = new Scanner(System.in);

    public void simpanUang(){
        System.out.print("Simpan Uang : Rp. ");
        int uangDisetor = input.nextInt();
        if (uangDisetor >= 50_000){
            saldo = getSaldo() + uangDisetor;
            System.out.println("Saldo Saat ini : " + saldo + "\n");
        }
        else {
            System.out.println("Uang yang disetor dibawah nilai minmum!!" + System.err + "\n");
        }
    }

    public void ambilUang(){
        System.out.print("Ambil Uang : Rp. " );
        int uangDiambil = input.nextInt();
        if (uangDiambil <= getSaldo()){
            saldo = getSaldo() - uangDiambil;
            System.out.println("Saldo saat ini : Rp. " + saldo + "\n");
        }
        else {
            System.out.println("Saldo Tidak Mencukupi!!" + System.err + "\n");
        }
    }



}

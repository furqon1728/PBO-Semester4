package praktikum.pertemuan6;
//Modul Scanner
import java.util.Scanner;
public class Bank {
    int saldo;
    public Bank(int saldo){
        this.saldo = saldo;
    }
    public int getSaldo() {
        return saldo;
    }

    Scanner input = new Scanner(System.in);

    public void simpanUang(){
        System.out.print("\nJumlah uang yang anda simpan : Rp. ");
//        mengambil nilai dari input user
        int uangDisetor = input.nextInt();
        if (uangDisetor >= 50_000){
            saldo = getSaldo() + uangDisetor;
            System.out.println("Saldo anda adalah : " + saldo + "\n");
        }
        else {
            System.out.println("Uang yang disetor dibawah nilai minmum!!" + System.err + "\n");
        }
    }

    public void ambilUang(){
        System.out.print("\nJumlah Uang Yang Anda Ambil : Rp. " );
//        mengambil nilai dari input user
        int uangDiambil = input.nextInt();
        if (uangDiambil <= getSaldo()){
            saldo = getSaldo() - uangDiambil;
            System.out.println("Saldo anda adalah : Rp. " + saldo + "\n");
        }
        else {
            System.out.println("Saldo Tidak Mencukupi!!" + System.err + "\n");
        }
    }
}
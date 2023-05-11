package praktikum.pertemuan6;

import java.util.Scanner;

public class BankBeraksi {
    public static void main(String[] args) {
        Bank nasabah1 = new Bank(100000);

        Scanner input = new Scanner(System.in);

        System.out.println("Menu ATM\n1. Cek Saldo   2. Simpan Uang   3. Ambil Uang");
        System.out.print("Pilih Menu: ");
        int pilihanMenu = input.nextInt();
        if (pilihanMenu == 1){
            System.out.println("Jumlah Saldo Anda : Rp. " + nasabah1.getSaldo() );
        } else if (pilihanMenu == 2) {
            nasabah1.simpanUang();
        }else if (pilihanMenu == 3){
            nasabah1.ambilUang();
        }else {
            System.out.println("Tidak Ada Menu tersebut" + System.err);
        }

    }
}

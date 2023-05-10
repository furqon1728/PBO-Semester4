package praktikum.pertemuan6;

public class BankBeraksi {
    public static void main(String[] args) {
        Bank nasabah1 = new Bank();

        System.out.println("\nSelamat Datang di Bank ABC");
        System.out.println("Saldo saat ini : " + nasabah1.saldo + "\n");

        nasabah1.simpanUang();
        nasabah1.ambilUang();

        nasabah1.simpanUang();
        nasabah1.ambilUang();
    }
}

package praktikum.ModulPertemuan6;

public class DeretHurufAZ {
    public static void main(String[] args) {
//        menampilkan Huruf menggunakan ASCII printable characters
//        atau char yang dapat dicetak mewakili huruf, angka, tanda baca dan beberapa simbol lainnya

//        dalam tabel ASCII character A = 65 dan Z = 90
        char hurufKapitalAwal = 65, huruKapitalAkhir = 90;
        System.out.println("Huruf Kapital");
        for (char i = hurufKapitalAwal; i <= huruKapitalAkhir; i++){
            System.out.print(i + " ");
        }

//        dalam tabel ASCII character a = 97 dan z = 122
        char hurufKecilAwal = 97, hurufKecilAkhir = 122;
        System.out.println("\nHuruf Kecil");
        for (char i = hurufKecilAwal; i <= hurufKecilAkhir; i++){
            System.out.print(i + " ");
        }
    }
}

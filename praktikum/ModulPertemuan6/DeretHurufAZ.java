package praktikum.ModulPertemuan6;

public class DeretHurufAZ {
    public static void main(String[] args) {
//        menampilkan Huruf menggunakan ASCII printable characters
//        atau char yang dapat dicetak mewakili huruf, angka, tanda baca dan beberapa simbol lainnya

//        dalam tabel ASCII character A = 65 dan Z = 90
        char hurufKapitalAwal = 65, hurufKapitalAkhir = 90;
        System.out.println("Huruf Kapital A-Z");
        for (char i = hurufKapitalAwal; i <= hurufKapitalAkhir; i++){
            System.out.print(i + " ");
        }

//        dalam tabel ASCII character a = 97 dan z = 122
        char hurufKecilAwal = 97, hurufKecilAkhir = 122;
        System.out.println("\nHuruf Kecil a-z");
        for (char i = hurufKecilAwal; i <= hurufKecilAkhir; i++){
            System.out.print(i + " ");
        }

        System.out.println("\nHuruf Kecil z-a");
        for (char i = hurufKecilAkhir; i >= hurufKecilAwal; i--){
            System.out.print(i + " ");
        }

        System.out.println("\nHuruf Kapital Z-A");
        for (char i = hurufKapitalAkhir; i >= hurufKapitalAwal; i--){
            System.out.print(i + " ");
        }

    }
}

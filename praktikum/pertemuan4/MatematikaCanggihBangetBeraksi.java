package praktikum.pertemuan4;

public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
//        membuat object baru dan memanggil methode pertambahan
        MatematikaCanggihBanget hitungTambah = new MatematikaCanggihBanget();
        hitungTambah.tambah(10, 5);

//        membuat object baru dan memanggil methode perkalian
        MatematikaCanggihBanget hitungKali = new MatematikaCanggihBanget();
        hitungTambah.kali(20, 5);

//        membuat object baru dan memanggil methode modulus
        MatematikaCanggihBanget hitungModulus = new MatematikaCanggihBanget();
        hitungTambah.modulus(100, 30);

//        membuat object baru dan memanggil methode pertambahan tigas
        MatematikaCanggihBanget hitungPertambahanTiga = new MatematikaCanggihBanget();
        hitungTambah.pertambahanTiga(10, 20, 30);
    }
}

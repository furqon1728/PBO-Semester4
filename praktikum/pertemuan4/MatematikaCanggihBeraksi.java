package praktikum.pertemuan4;

public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
//        membuat obect baru dan memanggil methode tambah
        MatematikaCanggih hitungTambah = new MatematikaCanggih();
        hitungTambah.tambah(10, 5);

//        membuat obect baru dan memanggil methode kurang
        MatematikaCanggih hitungKurang = new MatematikaCanggih();
        hitungKurang.kurang(20, 5);

//        membuat obect baru dan memanggil methode kali
        MatematikaCanggih hitungKali = new MatematikaCanggih();
        hitungKali.kali(30, 5);

//        membuat obect baru dan memanggil methode bagi
        MatematikaCanggih hitungBagi = new MatematikaCanggih();
        hitungBagi.bagi(40, 5);

//        membuat obect baru dan memanggil methode modulus
        MatematikaCanggih hitungModulus = new MatematikaCanggih();
        hitungModulus.modulus(100, 30);

    }
}

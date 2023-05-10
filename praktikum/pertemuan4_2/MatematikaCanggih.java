package praktikum.pertemuan4_2;

public class MatematikaCanggih extends Matematika {

//    Membuat konstruktor dengan 2 parameter : nim & nama
    String nama, nim;
    protected MatematikaCanggih(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIM\t\t\t: " + nim + "\n");
    }

}

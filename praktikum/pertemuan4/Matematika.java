package praktikum.pertemuan4;

public class Matematika {
    int hasil;

    /*public*/ void tambah(int a, int b){
        hasil = a + b;
        System.out.println("Hasil\t" + a + " + " + b + " = " + hasil);
    }
    /*public*/ void kali(int a, int b){
        hasil = a * b;
        System.out.println("Hasil\t" + a + " X " + b + " = " + hasil);
    }
    /*public*/ void kurang(int a, int b){
        hasil = a - b;
        System.out.println("Hasil\t" + a + " - " + b + " = " + hasil);
    }
    /*public*/ void bagi(int a, int b){
        hasil = a / b;
        System.out.println("Hasil\t" + a + " : " + b + " = " + hasil);
    }

}

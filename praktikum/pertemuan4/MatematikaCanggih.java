package praktikum.pertemuan4;

public class MatematikaCanggih extends Matematika {
    void modulus(int a, int b){
        hasil = a % b;
        System.out.println("Modulus\t" + a + " % " + b + " = " + hasil);
    }
}

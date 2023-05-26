package praktikum.ModulPrakPertemuan6;

public class SegitigaBeraksi {
    public static void main(String[] args) {
        Segitiga kecil = new Segitiga(5);
        System.out.println(kecil.gambarSegitiga());
        Segitiga besar = new Segitiga(15);
        System.out.println(besar.gambarSegitiga());
    }
}

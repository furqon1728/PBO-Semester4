package OutClass.LatihanInterface;

public class Matematika implements InterfaceMatematika{
    double hasil;

    public Matematika(String nama, String nim){
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIM\t\t: " + nim);
    }
    public void perkalian(int a, int b){
        hasil = a * b;
        System.out.println(a + " X " + b + " = " + hasil);
    }
    public void pembagian(int a, int b){
        hasil = a / b;
        System.out.println(a + " : " + b + " = " + hasil);
    }
    public void modulus(int a, int b){
        hasil = a % b;
        System.out.println(a + " % " + b + " = " + hasil);
    }



    //    overloading pada methode pertambahan
    public void pertambahan(double a, double b, double c ){
        hasil = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + hasil);
    }
    public void pertambahan(double a, int b, int c ){
        hasil = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + hasil);
    }
    public void pertambahan(int a, double b){
        hasil = a + b;
        System.out.println(a + " + " + b + " = " + hasil);
    }
    public void pertambahan(double a, int b){
        hasil = a + b;
        System.out.println(a + " + " + b + " = " + hasil);
    }

    //    Overloading pada methode pengurangan
    public void pengurangan(int a, int b){
        hasil = a + b;
        System.out.println(a + " - " + b + " = " + hasil);
    }

    public void pengurangan(int a, double b){
        hasil = a + b;
        System.out.println(a + " - " + b + " = " + hasil);
    }

    public void pengurangan(double a, double b){
        hasil = a + b;
        System.out.println(a + " - " + b + " = " + hasil);
    }

}


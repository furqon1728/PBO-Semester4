package OutClass.LatihanInterface;

public interface InterfaceMatematika {

    void perkalian(int a, int b);
    void pembagian(int a, int b);
    void modulus(int a, int b);



    //    overloading pada methode pertambahan
    void pertambahan(double a, double b, double c );
    void pertambahan(double a, int b, int c );
    void pertambahan(int a, double b);
    void pertambahan(double a, int b);
    //    Overloading pada methode pengurangan
    void pengurangan(int a, int b);
    void pengurangan(int a, double b);
    void pengurangan(double a, double b);
}

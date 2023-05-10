package OutClass.LatihanInterface;

import praktikum.pertemuan4_2.MatematikaCanggih;

public class InterfaceMatematikaBeraksi {
    public static void main(String[] args) {
        Matematika object1 = new Matematika("Muhammad Furqon Huwaidy", "2110631250082");
        object1.pertambahan(12.5, 28.7, 14.2);
        object1.pertambahan(12.6, 28, 14);
        object1.pertambahan(23, 34.5);
        object1.pertambahan(3.4, 9);
    }
}

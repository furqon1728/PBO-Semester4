package praktikum.pertemuan3;

public class Penambahan2 {
    public static void main(String[] args) {
        int w, x, y, z;

        x = 5; w = 5;
        y = 8 - x++;
        z = 8 - ++w;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("w = " + w);
        System.out.println("z = " + z);
    }
}

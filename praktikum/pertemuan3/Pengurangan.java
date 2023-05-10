package praktikum.pertemuan3;

public class Pengurangan {
    public static void main(String[] args) {
        int x,y,z;
        x = 42;
        y = x--;
//        tampilkan x,y saat ini
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        z = --x;
//        tampilkan x,z saat ini
        System.out.println("x = " + x);
        System.out.println("z = " + z);
    }
}

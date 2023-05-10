package praktikum.pertemuan3;

public class programKaliBagi {

    public static void main(String[] args) {
        int n, x, z;
        n = 1024;
//        *2
        x = 1 << n;
//        /2
        z = x >> n;

        System.out.println("n = " + n);
        System.out.println("x = " + x);
        System.out.println("z = " + z);
    }
}

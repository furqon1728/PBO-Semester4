package praktikum.prakPertemuan6;

public class PernyataanIF {
    public static void main(String[] args) {
        int diskon = 0, totalBelanja = 500_000;

        if (totalBelanja >= 100_000){
            diskon = totalBelanja/10;
        }
        System.out.println("Diskon = " + diskon);
    }
}

package praktikum.ModulPertemuan6;

public class HitungGanjilGenap {
    public static void main(String[] args) {
        int bilAwal = 0, bilAkhir = 20;

//        menghitung bilangan genap
        System.out.println("Bilangan genap dari " + bilAwal + " sampai " + bilAkhir + " :");
        for (int i = bilAwal; i <= bilAkhir;i++){
//            bilangan genap adalah bilangan yang habis jika dibagi 2
            if (i%2 == 0){
                System.out.print(i + " ");
            }
        }

//        menghitung bilangan ganjil
        System.out.println("\nBilangan ganjil dari " + bilAwal + " sampai " + bilAkhir + " :");
        for (int i = bilAwal; i <= bilAkhir;i++){
//            bilangan genap adalah bilangan yang tidak habis jika dibagi 2
            if (i%2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}

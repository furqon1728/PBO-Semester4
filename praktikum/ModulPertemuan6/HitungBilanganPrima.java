package praktikum.ModulPertemuan6;

public class HitungBilanganPrima {
    public static void main(String[] args) {
        int bilAwal = 0, bilAkhir = 20;

//        Menghitung Bilangan Prima
        System.out.println("Bilangan Prima dari " + bilAwal + " Sampai " + bilAkhir + " :");
        for (int i = bilAwal; i <= bilAkhir;i++){
            int nPembagian = 0;
            for (int j = 1;j<=bilAkhir;j++){
                if (i%j == 0){
                    nPembagian++;
                }
            }
//            bilangan prima adalah bilangan yang akan habis jika dibagi dengan 1 dan bilangan itu sendiri
//            maka hanya akan ada 2 pembagian saja

            if (nPembagian == 2){
                System.out.print(i + " ");
            }
        }

//        Menghitung Bilangan Komposit
        System.out.println("\nBilangan Komposit dari " + bilAwal + " Sampai " + bilAkhir + " :");
        for (int i = bilAwal; i <=bilAkhir;i++){
            int nPembagian = 0;
            for (int j = 1;j<=bilAkhir;j++){
                if (i%j==0){
                    nPembagian++;
                }
            }
//            Bilangan komposit adalah bilangan asli lebih dari 1 yang bukan merupakan bilangan prima.
//            bilangan Komposit akan menghasilkan lebih dari 2x pembagian
            if (nPembagian > 2 && i != 0){
                System.out.print( i + " ");
            }
        }
    }
}


package praktikum.pertemuan10;
public class CekBilangan {
    public static void main(String[] args) {
        int[] intArray = {
                9,3,7,8,2,4
        };

        System.out.println("Bilangan Sebelum Ditukar");
//        menampilkan elemen array dengan for array
        for (int i : intArray) {
            System.out.print(i + " ");
        }

//        bilangan setelah ditukar
        int angkaDitukar;
        for (int j = 0; j < intArray.length; j++){
            for (int k = 0; k < intArray.length; k++){
                if (intArray[j] < intArray[k]){
                    angkaDitukar = intArray[j];
                    intArray[j] = intArray[k];
                    intArray[k] = angkaDitukar;
                }
            }
        }

        System.out.println("\n\nBilangan Setelah Ditukar : ");
        for (int l : intArray){
            System.out.print(l + " ");
        }
    }
}

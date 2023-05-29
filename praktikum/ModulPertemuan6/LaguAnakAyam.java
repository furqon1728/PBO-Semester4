package praktikum.ModulPertemuan6;

public class LaguAnakAyam {
    public static void main(String[] args) {
        int anakAyam = 4;
        for (int i = anakAyam; i > 1 ;i--){
//            lirik tekotek-tekotek muncul pada sebelum anak ayam turunlah 4 dan 2
            for (int j = anakAyam ; j == 4 || j == 2;j++){
                System.out.println("\nTek kotek, kotek kotek\nAnak ayam turunlah berkotek\nTek kotek, kotek kotek\nAnak ayam turunlah berkotek\n");
            }

            System.out.println("Anak ayam  turunlah " + anakAyam);
            int sisaAyam = anakAyam - 1;
            System.out.println("Mati satu tinggallah " + sisaAyam);
            anakAyam--;

            if (anakAyam ==1){
                System.out.println("Anak ayam turunlah " + anakAyam);
                System.out.println("Mati satu tinggallah induknya ");
            }
        }
    }
}

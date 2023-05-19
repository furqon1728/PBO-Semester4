package praktikum.pertemuan10;

public class NegaraKota {
    public static void main(String[] args) {
        String[][] negaraKota = {
                {"Amerika", "Inggris", "Jepang", "Perancis", "Indonesia", "Iran", "Irak"},
                {"Teheran", "Bekasi", "Jakarta", "Bantar Gebang", "Tokyo"}
        };

        System.out.println("Ibukota " + negaraKota[0][4] + " adalah " + negaraKota[1][2]);
        System.out.println("Ibukota " + negaraKota[0][2] + " adalah " + negaraKota[1][4]);
        System.out.println("Ibukota " + negaraKota[0][5] + " adalah " + negaraKota[1][0]);
    }



}

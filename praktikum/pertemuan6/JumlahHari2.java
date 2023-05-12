package praktikum.pertemuan6;

public class JumlahHari2 {
    public void hitungHari(int tahun, int bulan){
        if (bulan > 12){
            System.out.println("Jumlah bulan hanya 12 saja!!" );
            System.out.println(System.err);
            System.exit(0);
        }
        int jumlahHari = bulan % 2;
        switch (jumlahHari){
            case 0:
                if ( ( bulan == 2 && ( (tahun % 400) == 0 || ( (tahun %4 == 0)  && (tahun % 100) !=0 )  ))){
                    System.out.println("Masukkan tahun : " + tahun);
                    System.out.println("Masukkan bulan : " + bulan);
                    System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 29 hari");
                } else if (( bulan == 2 && (tahun % 400) != 0 || ( (tahun %4 != 0)  && (tahun % 100) ==0  ))) {
                    System.out.println("Masukkan tahun : " + tahun);
                    System.out.println("Masukkan bulan : " + bulan);
                    System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 28 hari");
                } else if ( (bulan == 8) || (bulan == 10) || (bulan == 12) ) {
                    System.out.println("Masukkan tahun : " + tahun);
                    System.out.println("Masukkan bulan : " + bulan);
                    System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 31 hari");
                } else {
                    System.out.println("Masukkan tahun : " + tahun);
                    System.out.println("Masukkan bulan : " + bulan);
                    System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 30 hari");
                }
                break;
            case 1:
                if ( (bulan == 9) || (bulan == 11)){
                    System.out.println("Masukkan tahun : " + tahun);
                    System.out.println("Masukkan bulan : " + bulan);
                    System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 30 hari");
                }else {
                    System.out.println("Masukkan tahun : " + tahun);
                    System.out.println("Masukkan bulan : " + bulan);
                    System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 31 hari");
                }
                break;
        }
    }
}

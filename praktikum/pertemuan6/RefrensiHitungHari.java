package praktikum.pertemuan6;

import java.util.Scanner;

public class RefrensiHitungHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan tahun: ");
        int tahun = input.nextInt();
        System.out.println("Masukan bulan: ");
        int bulan = input.nextInt();

        switch(bulan){
            case 1 :
                System.out.println("Jumlah hari pada tahun " + tahun + " bulan " + bulan + " adalah 31 hari "); 
                break;
            case 2 :
                if(((tahun%4==0) && (tahun %100!=0)) || (tahun %400==0)){
                    System.out.println("Jumlah hari pada tahun " + tahun +" bulan " + bulan +" adalah 29 hari ");
                }
                else{
                    System.out.println("Jumlah hari pada tahun " + tahun+" bulan "+ bulan+ " adalah 28 hari ");
                }
                break;
            case 3 :
                System.out.println("Jumlah hari pada tahun " + tahun+ " bulan " +  bulan + " adalah 31 hari "); 
                break;
            case 4 :
                System.out.println("Jumlah hari pada tahun "+ tahun+" bulan "+
                    bulan+" adalah 30 hari");
                break;
            case 5 :
                System.out.println("Jumlah hari pada tahun "+ tahun+" bulan "+
                    bulan+" adalah 31 hari");
                break;
            case 6 :
                System.out.println("Jumlah hari pada tahun "+ tahun+" bulan "+ bulan +" adalah 30 hari");
                break;
            case 7 :
                System.out.println("Jumlah hari pada tahun "+ tahun+" bulan "+ bulan+" adalah 31 hari");
                break;
            case 8 :
                System.out.println("Jumlah hari pada tahun "+ tahun+" bulan "+ bulan+" adalah 31 hari");
                break;
            case 9 :
                System.out.println("Jumlah hari pada tahun "+ tahun+" bulan " + bulan+" adalah 30 hari");
                break;
            case 10 :
                System.out.println("Jumlah hari pada tahun "+ tahun+" bulan " + bulan+" adalah 31 hari");
                break;
            case 11 :
                System.out.println("Jumlah hari pada tahun "+ tahun+" bulan "+ bulan +" adalah 30 hari");
                break;
            case 12 :
                System.out.println("Jumlah hari pada tahun "+ tahun+" bulan "+ bulan+ " adalah 31 hari");
                break;
            default:
                System.out.println("Jumlah bulan hanya 12!");
        }
    }
}

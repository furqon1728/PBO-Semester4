package praktikum.prakPertemuan4;

public class SepedaGunung extends Sepeda{
    void setGir(int pertambahanGir){
        super.setGir(pertambahanGir);
        gir = 2*getGir();
    }

//    private int sadel;

//    void setSadel(int jumlah){
//        sadel = getGir() - jumlah;
//    }
//
//    int getSadel(){
//        return sadel;
//    }
}

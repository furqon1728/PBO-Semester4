package praktikum.ModulPrakPertemuan8;

public class NilaiMhs {
    double tm, uas, uts, rata;
    char grade;
    double nilaiRata(){
        rata = (tm+uts+uas)/3;
        return rata;
    }
}

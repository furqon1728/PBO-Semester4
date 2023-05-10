package praktikum.pertemuan5;

public class ACBeraksi implements InterfaceBeraksi{
    boolean statusAc;
    int suhuAC = 30;

    public ACBeraksi(boolean statusAc) {
        this.statusAc = statusAc;
        if (statusAc == false){
            System.out.println("Status AC Saat Ini  : Mati\n");
        }
        else{
            System.out.println("Status AC Saat Ini  : Hidup\n");
        }
    }

    public void hidupkanAC(){
        if (statusAc == KEADAAN_AC_MATI){
            statusAc = KEADAAN_AC_HIDUP;
            System.out.println("Hidupkan AC! --> AC Hidup");
            System.out.println("Suhu AC Saat ini " + suhuAC + " Celcius\n");
        }
        else {
            System.out.println("Hidupkan AC! --> AC Sudah Hidup!!\n");
        }
    }
    public void matikanAC(){
        if (statusAc == KEADAAN_AC_HIDUP){
            statusAc = KEADAAN_AC_MATI;
            System.out.println("Matikan AC! --> AC Mati\n");
        }else {
            System.out.println("Matikan AC! --> AC Sudah Mati!!\n");
        }
    }

    public void dinginkanAC(){
        if (suhuAC == 30){
            suhuAC = 16;
            System.out.println("Dinginkan AC! --> Suhu AC Diturunkan");
            System.out.println("Suhu AC Saat ini " + suhuAC + " Celcius\n");
        }
        else{
            System.out.println("Dinginkan AC! --> Suhu AC Sudah Dingin!!\n");
        }
    }

    public void panaskanAC(){
        if (suhuAC == 16){
            suhuAC = 30;
            System.out.println("Panaskan AC! --> Suhu AC Dinaikkan");
            System.out.println("Suhu AC Saat ini " + suhuAC + " Celcius\n");
        }
        else{
            System.out.println("Panaskan AC! --> Suhu AC Sudah Panas!!\n");
        }

    }

    public static void main(String[] args) {
        ACBeraksi AcKamar = new ACBeraksi(false);

        AcKamar.hidupkanAC();
        AcKamar.dinginkanAC();
        AcKamar.panaskanAC();
        AcKamar.panaskanAC();
        AcKamar.matikanAC();
        AcKamar.matikanAC();
        AcKamar.hidupkanAC();
        AcKamar.hidupkanAC();
        AcKamar.dinginkanAC();
        AcKamar.dinginkanAC();
    }

}

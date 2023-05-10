package praktikum.prakpertemuan5;

public class LampuBeraksi {
    public static void main(String[] args) {
        Lampu lampuKamar = new Lampu();

        System.out.println("Status Lampu Saat Ini : Mati");

        lampuKamar.hidupkan();//HidupkanLampu
        lampuKamar.matikan();//MatikanLampu
        lampuKamar.matikan();//MatikanLampu
        lampuKamar.hidupkan();//HidupkanLampu
        lampuKamar.hidupkan();//HidupkanLampu
    }
}

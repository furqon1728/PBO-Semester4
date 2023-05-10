package praktikum.prakpertemuan5;

public class Lampu implements InterfaceLampu{
    int statusLampu;
    public void hidupkan(){
        if (statusLampu == KEADAAN_MATI){
            statusLampu = KEADAAN_HIDUP;
            System.out.println("Hidupkan Lampu! --> Lampu Hiduo");
        }
        else {
            System.out.println("Hidupkan Lampu! --> Lampu Sudah Hidup Kok");
        }
    }
    public void matikan(){
        if (statusLampu == KEADAAN_HIDUP){
            statusLampu = KEADAAN_MATI;
            System.out.println("Hidupkan Lampu! --> Lampu Mati");
        }
        else {
            System.out.println("Hidupkan Lampu! --> Lampu Sudah Mati Kok");
        }
    }


}

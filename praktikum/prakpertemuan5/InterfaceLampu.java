package praktikum.prakpertemuan5;

public interface InterfaceLampu {
    public static final int KEADAAN_HIDUP = 1;
    public static final int KEADAAN_MATI = 0;
    public abstract void hidupkan();
    public abstract void matikan();
}

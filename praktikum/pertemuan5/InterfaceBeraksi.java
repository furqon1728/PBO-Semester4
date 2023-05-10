package praktikum.pertemuan5;

public interface InterfaceBeraksi {
    public static final boolean KEADAAN_AC_HIDUP = true;
    public static final boolean KEADAAN_AC_MATI = false;
    public abstract void hidupkanAC();
    public abstract void matikanAC();
    public abstract void dinginkanAC();
    public abstract void panaskanAC();
}

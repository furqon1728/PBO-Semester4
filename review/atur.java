package review;

class kuliah{
    private String matkul;

    public void setMatkul(String matkul){
        this.matkul = matkul;
    }
    public String getMatkul(){
        return this.matkul;
    }
}

public class atur {
    public static void main(String[] args) {
        kuliah hasil = new kuliah();

        hasil.setMatkul("Rekayasa Perangkat Lunak");
        System.out.println("Matukul : " + hasil.getMatkul());
    }
}

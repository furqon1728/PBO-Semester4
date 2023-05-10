package praktikum.prakPertemuan6;

public class pernyataanIFELSEIF {
    public static void main(String[] args) {
        int skorUjian = 86; char nilai;
        if (skorUjian >= 90){
            nilai = 'A';
        } else if (skorUjian >= 80) {
            nilai = 'B';
        } else if (skorUjian >= 70) {
            nilai = 'C';
        }else {
            nilai = 'D';
        }
        System.out.println("Nilai = " + nilai);
    }
}

package praktikum.pertemuan6;

public class Mahasiswa2 extends Mahasiswa1{
    public void grade(){
        if (getNilAkhir() >= 80){
            String grade = "A";
            System.out.println("Grade\t:" + grade);
        } else if (getNilAkhir() >= 65) {
            String grade = "B";
            System.out.println("Grade\t:" + grade);
        } else if (getNilAkhir() >= 56) {
            String grade = "C";
            System.out.println("Grade\t:" + grade);
        } else if (getNilAkhir() >= 40) {
            String grade = "D";
            System.out.println("Grade\t:" + grade);
        }else {
            String grade = "E";
            System.out.println("Grade\t:" + grade);
        }

    }
}

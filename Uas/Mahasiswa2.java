package Uas;

public class Mahasiswa2 extends Mahasiswa1{
    char Grade(){
        if (NA >= 80){
            grade = 'A';
        } else if (NA >= 65) {
            grade = 'B';
        } else if (NA >= 56) {
            grade = 'C';
        } else if (NA >= 40) {
            grade = 'D';
        } else {
            grade = 'E';
        }
        return grade;
    }

}

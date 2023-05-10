package OutClass.PraPertemuan5;

public class KonversiSuhu {
    public void celciusToFahrenheit(int a){
        int hasil = ((a * 9)/5) + 32;
        System.out.println(a + " °C = " + hasil + "°F");
    }
    public void celciusToReamur(int a, int b){
        int hasil = ((a * 4)/5);
        double hasil2 = b * 0.8;
        System.out.println(a + " °C = " + hasil + "°F");
        System.out.println(b + " °C = " + hasil2 + "°Re");
    }


}

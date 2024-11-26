import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = scanner.nextDouble();
        
        konversiSuhu(celsius);
    }

    public static void konversiSuhu(double celsius) {
        double reamur = (4.0 / 5.0) * celsius;
        double fahrenheit = (9.0 / 5.0) * celsius + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Hasil konversi:");
        System.out.println(celsius + " derajat Celsius = " + reamur + " derajat Reaumur");
        System.out.println(celsius + " derajat Celsius = " + fahrenheit + " derajat Fahrenheit");
        System.out.println(celsius + " derajat Celsius = " + kelvin + " Kelvin");
    }
}

import java.util.Scanner;
public class PemilihanPercobaan106 {
    public static void main(String[]args){
        Scanner input06 = new Scanner (System.in);

        System.out.println("Masukkan angka : ");
        int angka = input06.nextInt();

        String bilangan = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.println(angka+ " adalah "+ bilangan);
    }
}
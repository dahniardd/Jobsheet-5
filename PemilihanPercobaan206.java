import java.util.Scanner;
public class PemilihanPercobaan206 {
    public static void main(String[]args){
        Scanner input06 = new Scanner(System.in);

        System.out.print("Nilai uas      : ");
        float uas = input06.nextFloat();
        System.out.print("Nilai uts      : ");
        float uts = input06.nextFloat();
        System.out.print("Nilai kuis     : ");
        float kuis = input06.nextFloat();
        System.out.print("Nilai tugas    : ");
        float tugas = input06.nextFloat();

        float total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);

        String message = total < 65 ? "Remidi" : "Tidak Remidi";

        System.out.println("Nilai akhir = " + total + " Sehingga "+message);
    }
}

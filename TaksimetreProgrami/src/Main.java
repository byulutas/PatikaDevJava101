import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe,acilisUcreti=10;
        double mesafebasina=2.20,toplamTutar=10;

        Scanner input=new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz:");
        mesafe= input.nextInt();

        toplamTutar= toplamTutar+(mesafe*mesafebasina);
        toplamTutar=(toplamTutar<20)?20:toplamTutar;
        System.out.println("Toplam Tutar:"+toplamTutar);

    }
}
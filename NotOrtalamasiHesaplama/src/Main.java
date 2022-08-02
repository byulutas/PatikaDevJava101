import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        // Değişkenleri oluşturdum
        int matematik, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfını tanımladım
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değerleri aldım
        System.out.print("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6;


        System.out.println("Not ortalamanız: " + sonuc);
        System.out.println(sonuc >= 60 ? "Tebrikler, sınıfı geçtiniz!" : "Maalesef, sınıfta kaldınız!");
    }
}
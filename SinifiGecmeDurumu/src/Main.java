import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int turkce,matematik,fizik, kimya,muzik,ortalama,DersSayisi = 0,toplamNot = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        if(!(turkce <= 0 || turkce > 100)) {
            toplamNot += turkce;
            DersSayisi++;
        }

        System.out.println("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();
        if(!(matematik <= 0 || matematik > 100)) {
            toplamNot += matematik;
            DersSayisi++;
        }

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();
        if(!(fizik <= 0 || fizik > 100)) {
            toplamNot += fizik;
            DersSayisi++;
        }

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if(!(kimya <= 0 || kimya > 100)) {
            toplamNot += kimya;
            DersSayisi++;
        }

        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();
        if(!(muzik <= 0 || muzik > 100)) {
            toplamNot += muzik;
            DersSayisi++;
        }

        ortalama = toplamNot / DersSayisi;

        if(ortalama < 55) {
            System.out.println("Geçme durumu: Kaldınız!");
        } else {
            System.out.println("Geçme durumu: Geçtiniz!");
        }
        System.out.println("Ortalamanız: " + ortalama);
    }
}

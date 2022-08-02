import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutKilo,elmeKilo,domatesKilo,muzKilo,patlicanKilo;
        double armutFiyatı,elmaFiyat,domatesFiyat,muzFiyat,patlicanFiyat,toplamFiyat;

        Scanner input=new Scanner(System.in);

        System.out.println("Kac kilo armut aldiniz:");
        armutKilo= input.nextDouble();

        System.out.println("Kac kilo armut aldiniz:");
        elmeKilo= input.nextDouble();

        System.out.println("Kac kilo domates aldiniz:");
        domatesKilo= input.nextDouble();

        System.out.println("Kac kilo muz aldiniz:");
        muzKilo= input.nextDouble();

        System.out.println("Kac kilo patlican aldiniz:");
        patlicanKilo= input.nextDouble();

        armutFiyatı=armutKilo*2.14;
        elmaFiyat=elmeKilo*3.67;
        domatesFiyat=domatesKilo*1.11;
        muzFiyat=muzKilo*0.95;
        patlicanFiyat=patlicanKilo*5.00;

        toplamFiyat=armutFiyatı+elmaFiyat+domatesFiyat+muzFiyat+patlicanFiyat;

        System.out.println("Toplam Fiyat:"+toplamFiyat +" TL");

    }
}
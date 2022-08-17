import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi,basamaklar=0,basamaklarToplami=0;

        System.out.println("Sayı Giriniz :");
        sayi = input.nextInt();

        while (sayi!=0) {

            basamaklar=sayi%10;
            sayi=sayi/10;
            basamaklarToplami=basamaklarToplami+basamaklar;

        }
        System.out.println("Sayı basamağı toplamı: " + basamaklarToplami);
    }
}
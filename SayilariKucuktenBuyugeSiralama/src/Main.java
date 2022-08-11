import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi1,sayi2,sayi3;

        Scanner input = new Scanner(System.in);

        System.out.println("1.Sayıyı Giriniz: ");
        sayi1 = input.nextInt();

        System.out.println("2.Sayıyı Giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("3.Sayıyı Giriniz: ");
        sayi3 = input.nextInt();

        if ((sayi1 > sayi2) && (sayi1 > sayi3)) {
            if (sayi2 > sayi3) {
                System.out.println("sayı3 < sayı2 < sayı1");
            } else {
                System.out.println("sayı2 < sayı3 < sayı1");
            }
        } else if ((sayi2 > sayi1) && (sayi2 > sayi3)) {
            if (sayi1 > sayi3) {
                System.out.println("sayı3 < sayı1 < sayı2");
            } else {
                System.out.println("sayı1 < sayı3 < sayı2");
            }
        } else {
            if (sayi1 > sayi2) {
                System.out.println("sayı2 < sayı1 < sayı3");
            } else {
                System.out.println("sayı1 < sayı2 < sayı3");
            }
        }

    }
}
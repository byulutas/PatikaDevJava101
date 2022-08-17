import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi, us, sonuc = 1;
        boolean kontrol = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz:");
        sayi = input.nextInt();
        System.out.print("Üsü giriniz:");
        us = input.nextInt();

        if (sayi >= 1 && us >= 0) {
            for (int i = 1; i <= us; i++) {

                if(us!=0) {
                    sonuc *= sayi;
                } else {
                    sonuc = 1;
                }

            }
        } else {
            kontrol = true;
        }

        if (kontrol == true) {
            System.out.println("Hatalı giriş yaptınız.");
        } else {
            System.out.println("Sonuc:" + sonuc);
        }
    }
}
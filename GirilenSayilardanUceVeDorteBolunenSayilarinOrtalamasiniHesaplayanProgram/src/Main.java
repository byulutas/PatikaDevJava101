import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, toplam = 0, sayiAdeti= 0;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Bir Sayı Giriniz : ");
        sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)){
                toplam += i;
                sayiAdeti++;
            }
        }
        ortalama = toplam / (sayiAdeti - 1);
        System.out.println("Ortalama:" + ortalama);
    }
}
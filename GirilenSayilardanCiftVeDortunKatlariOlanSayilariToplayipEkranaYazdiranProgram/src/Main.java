import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sayi, adet = 0, toplam = 0;

        Scanner input = new Scanner(System.in);


        do {
            System.out.println("Lütfen Bir Sayı Giriniz: ");
            sayi = input.nextInt();

            if (sayi % 4 == 0) {
                toplam += sayi;
            }

        }while (sayi%2 == 0);

        System.out.println(toplam);

    }
}
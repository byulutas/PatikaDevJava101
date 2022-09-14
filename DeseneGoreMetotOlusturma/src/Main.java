import java.util.Scanner;

public class Main {
    public static void desen(int sayi,int kontrolsayi, int x) {
      if(sayi > 0 && x == 0) {
            System.out.print(sayi + " ");
            sayi -= 5;
            desen(sayi,kontrolsayi,0);
        }


        else if(sayi == 0 || sayi < 0) {
            System.out.print(sayi + " ");
            sayi += 5;
            desen(sayi,kontrolsayi,1);
        }

       else if(sayi > 0 && sayi <= kontrolsayi && x == 1) {
            System.out.print(sayi + " ");
            sayi += 5;
            desen(sayi,kontrolsayi,1);
        }
    }

    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayiyi Giriniz: ");
        sayi = input.nextInt();

        desen(sayi,sayi,0);
    }
}
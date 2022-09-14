import java.util.Scanner;

public class Main {
    static int us(int taban, int us) {
        if (us == 0)
            return 1;
        return taban * us(taban, us - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir taban sayisi giriniz: ");
        int taban = input.nextInt();
        System.out.print("Bir kuvvet sayisi giriniz: ");
        int us = input.nextInt();

        System.out.println("Sonuc : " + us(taban, us));

    }
}
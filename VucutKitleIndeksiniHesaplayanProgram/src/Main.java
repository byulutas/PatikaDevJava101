import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilo;
        double boy, vucutKitleIndeksi;

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = scanner.nextInt();
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = scanner.nextDouble();

        vucutKitleIndeksi = kilo / (boy * boy);

        System.out.println("Vücut kitle indeksiniz : " + vucutKitleIndeksi);

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, u, cevre, alan;

        Scanner kenar = new Scanner(System.in);

        System.out.print("Birinci Kenari Giriniz:");
        a=kenar.nextDouble();
        System.out.print("İkinci Kenari Giriniz:");
        b=kenar.nextDouble();
        System.out.print("Ücüncü Kenari Giriniz:");
        c=kenar.nextDouble();

        u=(a+b+c)/2;
        cevre=(2*u);

        alan=Math.sqrt((u*((u-a)*(u-b)*(u-c))));
        System.out.print("Ucgenin Alani:"+ alan);

    }
}

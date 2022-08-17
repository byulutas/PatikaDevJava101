import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nFaktoriyel = 1, rFaktoriyel = 1, fFaktoriyel = 1;
        int fark,formul;
        int n, r, i = 1;


        System.out.println("Eleman Sayısı (n): ");
        n = input.nextInt();

        System.out.println("Seçim Sayısı (r): ");
        r = input.nextInt();

        for (i = 1; i <= n; i++) {
             nFaktoriyel*= i;
        }

        for (i = 1; i <= r; i++) {
            rFaktoriyel *= i;
        }

        fark = (n - r);

        for (i = 1; i <= fark; i++) {
            fFaktoriyel *= i;
        }

        formul = nFaktoriyel / (rFaktoriyel * fFaktoriyel);

        System.out.println("C(" + n + "," + r + ")=" + formul);
    }
}
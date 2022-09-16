import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    static String[][] mayinTarlasiAlani(int satirsayisi, int sutunsayisi) {
        Random randomNumber = new Random();
        String[][] alan = new String[satirsayisi][sutunsayisi];

        int dusuk = 0;
        int satir = satirsayisi;
        int sutun = sutunsayisi;
        int mayin = satirsayisi * sutunsayisi / 4;
        int i = 0;

        while (i < mayin) {
            int randomrow = randomNumber.nextInt(satir - dusuk) + dusuk;
            int randomcol = randomNumber.nextInt(sutun - dusuk) + dusuk;
            if (alan[randomrow][randomcol] != " * ") {
                alan[randomrow][randomcol] = " * ";
                i++;
            }

        }

        for (i = 0; i < satirsayisi; i++) {
            for (int j = 0; j < sutunsayisi; j++) {
                if (alan[i][j] != " * ") {
                    alan[i][j] = " - ";
                }
            }
        }
        return alan;
    }

    static void print(String[][] alan) {
        for (int i = 0; i < alan.length; i++) {
            for (int j = 0; j < alan[i].length; j++) {
                System.out.print(alan[i][j]);
            }
            System.out.println();
        }
    }

    static String[][] bosAlan(int a, int b) {
        String[][] bosAlan = new String[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                bosAlan[i][j] = " - ";
            }
        }
        return bosAlan;
    }

    static String[][] kontrol(String[][] alan, String[][] bosAlan, int x, int y) {
        int mayin = x * y / 4;
        int kalan = (x * y) - mayin;

        boolean devam = true;

        while (devam) {
            Scanner input = new Scanner(System.in);
            System.out.print("Satir seciniz: ");
            int a = input.nextInt();
            System.out.print("Sutun seciniz: ");
            int b = input.nextInt();

            if (a < 0 || a >= x || b < 0 || b >= y){
                System.out.println("Hatali deger girdiniz");
                continue;
            }

            if (alan[a][b].equals(" * ")) {
                System.out.println("-----------------------------Oyun Bitti-----------------------------");
                System.out.println("-----------------------------Mayin Tarlasi--------------------------");
                MineSweeper.print(alan);
                devam = false;
                break;

            } else if (alan[a][b].equals(bosAlan[a][b])) {
                int count = 0;
                for (int i = -1; i <= 1; i++) {
                    if (((a + i) < 0) || (a + i >= alan.length)) {
                        continue;
                    }
                    for (int j = -1; j <= 1; j++) {
                        if (((b + j) < 0) || (b + j >= alan.length)) {
                            continue;
                        }
                        if (alan[a + i][b + j].equals(" * ")) {
                            count++;
                        }
                    }
                }
                bosAlan[a][b] = " " + count + " ";
                MineSweeper.print(bosAlan);
                kalan--;
            }
            System.out.println("kalan bosluk : " + kalan);
            if (kalan == 0) {
                System.out.println("kazandın");
                break;
            }
        }
        return alan;
    }
}

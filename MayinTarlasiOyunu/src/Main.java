import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Satir sayisi : ");
        int satirSayisi = input.nextInt();
        System.out.print("Sutun sayisi : ");
        int sutunSayisi = input.nextInt();
        String[][] alan = MineSweeper.mayinTarlasiAlani(satirSayisi, sutunSayisi);
        String[][] bosAlan = MineSweeper.bosAlan(satirSayisi, sutunSayisi);
        MineSweeper.print(bosAlan);
        MineSweeper.kontrol(alan, bosAlan, satirSayisi, sutunSayisi);
    }}
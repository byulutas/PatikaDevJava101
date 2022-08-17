import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int sayi,i;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi giriniz : ");
        sayi = scanner.nextInt();

        System.out.println("Dördün kuvvetleri : ");
        for(i = 1; i<=sayi; i *= 4){
            if(i!=1)
            System.out.println(i);
        }
        System.out.println("Beşin Kuvvetleri : ");
        for(i=1; i<sayi; i *= 5){
            if(i!=1)
            System.out.println(i);
        }
    }
}
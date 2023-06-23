import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,i,j;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Basamak Sayısını Giriniz:");
        number = input.nextInt();
        for(i=1;i<=number;i++){
            for(j=number; j>=i; j--){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
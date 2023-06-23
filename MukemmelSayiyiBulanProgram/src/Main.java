import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,i,counter=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz: ");
        number = input.nextInt();

        for(i=1; i<number; i++){
            if(number%i == 0){
                counter+=i;
            }
        }
        if(counter == number){
            System.out.println(number +" mükemmel bir sayıdır.");
        }
        else{
            System.out.println(number + " mükemmel bir sayı değildir. ");
        }
    }
}
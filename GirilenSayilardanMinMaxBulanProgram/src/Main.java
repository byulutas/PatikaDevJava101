import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int counter,sayi,min=0,max=0,i=1,control=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Tane Sayi Gireceksiniz:");
        counter=input.nextInt();
        while (counter!=0)
        {
            System.out.print(i+".Sayi değerini giriniz:");
            sayi=input.nextInt();
            if(control<1){
                min=sayi;
                control++;
            }


            if (sayi>max)
                max=sayi;
            if (sayi<min)
                min=sayi;
            counter--;
            i++;

        }
        System.out.println("En büyük: " + max);
        System.out.println("En küçük:" + min);

    }
}
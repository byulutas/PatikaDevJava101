import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean artıkYil = false;
        int yil;

        Scanner input = new Scanner(System.in);
        System.out.println("Yıl Giriniz : ");
        yil = input.nextInt();

        if (yil % 4 == 0)
        {
            if (yil % 100 == 0)
            {
                if (yil % 400 == 0)
                {
                    artıkYil = true;
                }
                else
                {
                    artıkYil = false;
                }
            }
            else
            {
                artıkYil = true;
            }
        }
        else
        {
            artıkYil = false;
        }

        if (artıkYil)
        {
            System.out.println(yil + " bir artık yıldır !");
        }
        else
        {
            System.out.println(yil + " bir artık yıl değildir !");
        }
    }
}
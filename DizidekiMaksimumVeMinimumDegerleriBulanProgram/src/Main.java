import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] valueList = {11,72,-9,10,37,5,81,99,-65};
        Scanner input = new Scanner(System.in);

        System.out.println("Dizi :" + Arrays.toString(valueList));

        System.out.print("Bir sayi giriniz :");
        int number = input.nextInt();
        int min = number;
        int max = number;
        Arrays.sort(valueList);
        System.out.println("Dizinin siralı hali:" + Arrays.toString(valueList));

        for (int item: valueList){
            if (item > number){
                max = item;
                break;
            }
        }

        for (int i = valueList.length-1; i >= 0; i--){
            if (valueList[i] < number){
                min = valueList[i];
                break;
            }

        }

        System.out.println("En yakın büyük sayı :" +max);
        System.out.println("En yakın küçük sayı :" +min);

    }
}
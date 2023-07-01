public class Main {
    static boolean isFind(int list[], int value) {
        for (int i : list) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {41, 76, 53, 28, 36, 28, 28, 51, 96, -93, 76, 44, 12, 727};
        int[] repetitive = new int[array.length];
        int startIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j]) && (array[i] % 2 == 0)) {
                    if (!isFind(repetitive, array[i])) {
                        repetitive[startIndex++] = array[i];
                    }
                    break;
                }
            }
        }

        System.out.println("Sayı dizisindeki tekrar eden çift sayılar : ");

        for (int value : repetitive) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}
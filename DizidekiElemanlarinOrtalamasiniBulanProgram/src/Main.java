public class Main {
    public static void main(String[] args) {
        double[] list = {2, 4, 7, 9, 13, 17};
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        System.out.println(sum / list.length);
    }
}
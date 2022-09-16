public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Ahmet", 25, 110, 130,50);
        Fighter f2 = new Fighter("Mehmet", 20, 105, 110,40);

        Ring ring=new Ring(f1,f2,105,110);
        ring.run();

    }}
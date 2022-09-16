public class Ogretmen {

    String ad,telno,brans;

    Ogretmen(String ad, String telno, String brans) {

        this.ad = ad;
        this.brans = brans;
        this.telno = telno;

    }

    void yazdir() {
        System.out.println("Adı :" + this.ad);
        System.out.println("Branşı :" + this.brans);
        System.out.println("Telefon Numarası :" + this.telno);
    }
}
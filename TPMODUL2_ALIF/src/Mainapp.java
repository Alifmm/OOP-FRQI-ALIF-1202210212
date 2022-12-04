
public class Mainapp {
    public static void main(String [] args) {
        Perangkat perangkat = new Perangkat("Hyper X", 32, 5.6f);
        perangkat.informasi();

        System.out.println();

        Handphone hp = new Handphone(true, "A15 Bionic", 8, 2.6f);
        hp.informasi();
        hp.telfon(7345);
        hp.kirimSMS(21245);
        hp.manyMessage(46578, 6969696);

        System.out.println();

        Laptop laptop = new Laptop("Toshiba", 32, 4.8f, true);
        laptop.informasi();
        laptop.bukaGame("Point Blank");
        laptop.kirimEmail("maulanaalif216@gmail.com");
        laptop.multiEmail("maulanaalif216@gmail.com", "aleppp9@gmail.com");
    }
}
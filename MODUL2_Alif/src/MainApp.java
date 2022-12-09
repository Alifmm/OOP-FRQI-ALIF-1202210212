public class MainApp {
    public static void main(String[] args) {
    TransportasiAir transportasiAir = new TransportasiAir(5, 10000);
    transportasiAir.Informasi();


    System.out.println();

    Kapal kapal= new Kapal(2, 300000, "Ryzen");
    kapal.Berlabuh();
    kapal.Berlayar();
    kapal.Informasi();

    System.out.println();

    Sampan sampan = new Sampan(15, 100000, 2);
    sampan.Berlabuh();
    sampan.Berlayar();
    sampan.Informasi();

}}

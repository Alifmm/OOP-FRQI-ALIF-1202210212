import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        Database db = new Database();

        // TODO Create Menu
        Menu menu1 =new Menu();
        menu1.setName("Nasi Rendang");
        menu1.setCategory("Makanan");
        menu1.setPrice(8000);

        Menu menu2 =new Menu();
        menu2.setName("Es Teh");
        menu2.setCategory("Minuman");
        menu2.setPrice(5000);

        Menu menu3=new Menu();
        menu3.setName("Cookies");
        menu3.setCategory("Dessert");
        menu3.setPrice(7000);


        // TODO Insert Menu to Database
        db.insertMenu(menu1);
        db.insertMenu(menu2);
        db.insertMenu(menu3);

        // TODO Display Main Menu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selamat Datang di Restoran EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("=================================");
        System.out.print("Nama: ");
        String name = scanner.nextLine();
        System.out.print("No. Handphone: ");
        String phoneNumber = scanner.nextLine();


        // TODO Create User
        User user = new User();
        user.setName(name);
        user.setPhoneNumber(phoneNumber);
        user.register();

        // Display Menu
        while (true) {
            System.out.println("=================================");
            System.out.println("1.Menu");
            System.out.println("2.Cari Menu");
            System.out.println("3.Keluar");
            System.out.println("=================================");
            System.out.print("Pilih Menu: ");
            int menu = scanner.nextInt();
            if (menu == 1) {
                db.showMenu();
            } else if (menu == 2) {
                System.out.print("Masukkan Nama Menu: ");
                String keyword = scanner.next();
                db.searchMenu(keyword);
            } else if (menu == 3) {
                System.out.println("Terima Kasih");
                break;
            }
        }

    }
}

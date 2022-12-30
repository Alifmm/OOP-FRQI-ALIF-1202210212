import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[]args) throws InterruptedException {
        
        Calculation calc = new Calculation();
        Thread t1 = new Thread(calc);
        Scanner Input = new Scanner(System.in);
        boolean repeat = false;
        
        do {
            try {
            System.out.println("====menu program====");
            System.out.println("1. Square");
            System.out.println("2. Circle");
            System.out.println("3.Trapezoid");
            System.out.println("Select Menu: ");
            int operation = Input.nextInt();

                switch (operation) {
                    case 1:
                        System.out.println("Inputkan panjang sisi persegi: ");
                        calc.side = Input.nextDouble();
                        calc.setSquare();
                        t1.start();
                        t1.join();
                        System.out.println("Hasil perkalian luas dengan sisi " + calc.side + " : " + calc.getSquare());
                        break;

                    case 2:
                        System.out.println("Inputkan radius dari lingkaran: ");
                        calc.radius = Input.nextDouble();
                        calc.setCircle();
                        t1.start();
                        t1.join();
                        System.out.println("Hasil perkalian luas dengan radius " + calc.radius + " : "  + calc.getCircle());
                        break;

                    case 3:
                        System.out.println("Inputkan sisi bawah dari trapezoid: ");
                        double a = Input.nextDouble();

                        System.out.println("Inputkan sisi atas dari trapezoid: ");
                        double b = Input.nextDouble();

                        System.out.println("Inputkan tinggi dari trapezoid: ");
                        double t = Input.nextDouble();

                        calc.setTrapezoid(a, b, t);
                        t1.start();
                        t1.join();       
                        System.out.println("Hasil dari perkalian dengan sisi bawah trapezoid " + a + ", sisi atas trapezoid " + b + ", dan tinggi trapezoid " + t + " : "  + calc.getTrapezoid());
                        break;

                    case 0:
                        System.out.println("Program selesai.");
                        break;

                    default:
                        System.out.println("Options not available");

                }
            }catch (IllegalArgumentException e) {
                System.out.println("Invalid input must be number!!");
                
            }catch (InputMismatchException e) {
                System.out.println("Error : Input must be number");
            } 
        } while (repeat);
        Input.close();
    }
}

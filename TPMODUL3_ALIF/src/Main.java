import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        
        Restaurant restaurant = new Restaurant();
        Scanner Input = new Scanner(System.in);
        try {
    
            System.out.println("Enter customer ID: ");
            int customerId = Input.nextInt();
    
            System.out.println("How many food do you want to order: ");
            int Jumlahorder = Input.nextInt();

        Thread ta = new Thread(restaurant);
        Waiters waiter = new Waiters(Jumlahorder, customerId);
        Thread tb = new Thread(waiter);

        ta.start();
        tb.start();
        ta.join();
        tb.join();
        } 
        catch (Exception e) {
            System.out.println("Input must be integer");
        }  
    }
}

public class Waiters implements Runnable{
    protected int orderQty, customerId, foodPrice;
    public Waiters(int orderQty, int customerId){
        this.orderQty = orderQty;
        this.customerId = customerId;
        this.foodPrice = 20000;
    }
    @Override
    public void run(){
        while (true) {
            getFood();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Something went wrong ");
                e.printStackTrace();
            }
        }
    }
    public void getFood(){
        synchronized(Restaurant.getLock()) {
            System.out.println("Waiter: Food ready to deliver");
            Restaurant restaurant = new Restaurant();
            restaurant.setWaitingForPickup(false);

            if (restaurant.getFoodNumber() == this.orderQty + 1) {
                this.orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell restaurant to make another food");
        }
    }
    public void orderInfo(){
        System.out.println("\n=====================================");
        System.out.println("Customer: " + this.customerId );
        System.out.println("Number of food: " + this.orderQty);
        System.out.println("Total price: " + this.foodPrice * this.orderQty);
        System.out.println("=====================================");
    }
}
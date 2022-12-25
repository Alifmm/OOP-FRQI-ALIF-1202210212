public class Restaurant implements Runnable{
    private boolean waitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;

    @Override
    public void run(){
        while (true){
            makeFood();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Something went wrong ");
                e.printStackTrace();
            }
        }
    }
    public void makeFood() {
       synchronized(Restaurant.lock){
            if (this.waitingForPickup) {
                try {
                    System.out.println("Restaurant: Making food number " + (foodNumber-1));
                    Restaurant.lock.wait();
                } 
                catch (InterruptedException e) {
                    System.out.println("Something went wrong ");
                    e.printStackTrace();
                }
            }
            this.waitingForPickup = true;
                System.out.println("\nRestaurant: Making order number " + foodNumber++);
                Restaurant.lock.notifyAll();
                System.out.println("Restaurant: Telling the waiter to get order\n");
            }
        }
    public int getFoodNumber(){
        return foodNumber;
    }
    public void setWaitingForPickup(boolean waitingForPickup){
        this.waitingForPickup = waitingForPickup;
    } 
    public static Object getLock(){
        return lock;
    }    
}
class global {

    public static int rate = 10;

}

class DollarRate implements Runnable {
    
   
    public DollarRate() {
        
    }   

    @Override /** Override the run() method to tell the system
    * what task to perform
    */
    public void run() {
    	for (int i = 0; i < 10; i++) {
        	try {
            	Thread.sleep(2000);
        	} catch (Exception e) {
            	System.out.println(e.getMessage());
        	}
        	int rand = (int)(Math.random() * 100) + 10;
        	global.rate = rand;
    	}   
	}
}

class Exchange implements Runnable {
    private int amount;

    public Exchange(int n) {
        amount = n;
    }   

    @Override /** Tell the thread how to run */
    public void run() {
        for (int i = 1; i <= 30; i++) {
            System.out.println("Current rate = " + global.rate);
            System.out.println("Exchange amount for  " + amount + " is: " + amount * global.rate); 
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
         }
    }   
}

public class Main {
    public static void main(String[] args) {
        // Create tasks
        Runnable rate = new DollarRate();
        Runnable exchange = new Exchange(100);

        // Create threads
        Thread thread1 = new Thread(exchange);
        Thread thread2 = new Thread(rate);

        thread2.start();
        thread1.start();
    }   
}


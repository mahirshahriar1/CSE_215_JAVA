class PrintChar implements Runnable {
    private char charToPrint; // The character to print

    /** Construct a task with a specified character and number of
    * times to print the character
    */
    public PrintChar(char c) {
        charToPrint = c;
    }   

    @Override /** Override the run() method to tell the system
    * what task to perform
    */
    public void run() {
    	for (int i = 0; i < 10; i++) {
        	System.out.println(charToPrint);
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
        Runnable printA = new PrintChar('a');
        Runnable printB = new PrintChar('b');

        // Create threads
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);

        // Start threads
        thread1.start();
        thread2.start();
    }   
}


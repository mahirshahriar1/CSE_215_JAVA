class Account {
		private int balance = 0;

		public int getBalance() {
 			return balance;
		}

		public void deposit(int amount) {
		    int newBalance = balance + amount;
		    System.out.println("Thread" + Thread.currentThread().getName() + " Current balance is : " + balance);
			// This delay is deliberately added to magnify the
			// data-corruption problem and make it easy to see.
			try {
			    Thread.sleep(100);
			} catch (Exception ex) {
			}

			balance = newBalance;
		}
}

class UpdateAccount implements Runnable {
    Account account;
    
    UpdateAccount(Account acc)
    {
        account = acc;
    }
    
	public void run() {
        for (int i = 0; i < 10; i++) {
			account.deposit(10);
			    
		}
	 }
}


public class Main {


    
    public static void main(String[] args) {
        // Create tasks
        Account account = new Account();
        Runnable update = new UpdateAccount(account);

        // Create threads
        Thread thread1 = new Thread(update);
        Thread thread2 = new Thread(update);

        thread2.start();
        thread1.start();
        try {
        thread2.join();
        thread1.join();
        } catch (Exception ex) {
            
        }

        System.out.println("What is balance? " + account.getBalance());

    }
   
	
}

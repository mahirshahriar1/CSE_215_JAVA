/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
 class Account {
		private int balance = 0;

		public int getBalance() {
 			return balance;
		}

		public synchronized void deposit(int amount) {
		    
			int newBalance = balance + amount;

			// This delay is deliberately added to magnify the
			// data-corruption problem and make it easy to see.
			
			balance = newBalance;
		    System.out.println("balance : "  + balance);
		    notifyAll();
		}
		    
		
		public synchronized  void withdraw(int amount) {
		        while (balance < amount) {
		            try {
		                wait();
		            } catch (Exception ex) {
		                
		            }
		        }
			    int newBalance = balance - amount;

			    // This delay is deliberately added to magnify the
			    // data-corruption problem and make it easy to see.
			    

			    balance = newBalance;
			    System.out.println("balance : "  + balance);
		 }
		 
		
}  


class DepositAccount implements Runnable {
    Account account;
    
    DepositAccount(Account acc)
    {
        account = acc;
    }
    
	public void run() {
        for (int i = 0; i < 10; i++) {
			account.deposit(10);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
			}
		}
	 }
}

class WithdrawAccount implements Runnable {
    Account account;
    
    WithdrawAccount(Account acc)
    {
        account = acc;
    }
    
	public void run() {
        for (int i = 0; i < 5; i++) {
			account.withdraw(20);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ex) {
			}
		}
	 }
}

public class Main {


    
    public static void main(String[] args) {
        // Create tasks
        Account account = new Account();
        Runnable deposit = new DepositAccount(account);
        Runnable withdraw = new WithdrawAccount(account);

        // Create threads
        Thread thread1 = new Thread(deposit);
        Thread thread2 = new Thread(withdraw);

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

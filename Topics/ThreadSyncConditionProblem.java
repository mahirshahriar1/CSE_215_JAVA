
 class Account {
		private int balance = 0;

		public int getBalance() {
 			return balance;
		}

		public synchronized void deposit(int amount) {
		    
			int newBalance = balance + amount;
			System.out.println(Thread.currentThread().getName() + " Current balance: " + balance);

			balance = newBalance;
		   System.out.println(Thread.currentThread().getName() + " Updated balance: " + balance);
		}
		    
		
		public synchronized  void withdraw(int amount) {
		        
			    int newBalance = balance - amount;
			    System.out.println(Thread.currentThread().getName() + " Current balance: " + balance);

			    balance = newBalance;
			    System.out.println(Thread.currentThread().getName() + " Updated balance: " + balance);
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
        Thread thread1 = new Thread(deposit, "Deposit");
        Thread thread2 = new Thread(withdraw, "Withdraw");

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


class DebuggingExercise2
{ 
    public static void main(String[] args) 
    { 
        Account a = new Account("Balance"); 
        a.deposit(100); 
        System.out.println(a.getOwner() + " has $" + a.getBalance()); 
    } 
} 
  
package BankAccountInheritance

object BankAccountInheritance {
  def main(args: Array[String]): Unit = {
    //Creating a BankAccount
    println("Bank Account")
    val bankAccountObj = new BankAccount(4000)
    println("Initial Balance: "+bankAccountObj.viewBalance)
    //Withdrawing from BankAccount
    bankAccountObj.withdraw(200)
    //Amount after withdrawing
    println("After Withdrawing: "+bankAccountObj.viewBalance)
    bankAccountObj.deposit(500)
    println("After Depositing: "+bankAccountObj.viewBalance)

    //Creating Checking Account
    val checkAccountObj = new CheckingAccount(8500)
    //Calling inherited method of super class
    println("Initial Checking Account Balance: "+checkAccountObj.viewBalance)
    //Depositing money using overriddden method
    checkAccountObj.deposit(2512)
    println("After depositing Rs 2512 in checking account with fee deducted (Rs 1) "+checkAccountObj.viewBalance)
    checkAccountObj.withdraw(411)
    println("After withdrawing Rs 411 from checking account with fee deducted (Rs 1) "+ checkAccountObj.viewBalance)
  }

}

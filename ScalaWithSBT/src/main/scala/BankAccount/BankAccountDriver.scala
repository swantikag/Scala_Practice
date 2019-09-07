object BankAccountDriver{
  def main(args:Array[String]): Unit ={
    var obj1 = new BankAccount
    println("Initial Balance is : "+obj1.viewBalance)
    println("Depositing Rs 200 in the account")
    obj1.deposit(200)
    println("Balance after depositing is "+obj1.viewBalance)
    println("Withdrawing Rs 82 form the account")
    obj1.withdraw(82)
    println("Balance after withdrawing is "+obj1.viewBalance)
  }
}
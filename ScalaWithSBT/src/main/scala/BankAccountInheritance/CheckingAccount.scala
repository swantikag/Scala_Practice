package BankAccountInheritance

//CheckingAccount incurs a charge of Rs 1 for every deposit and withdraw operation

class CheckingAccount(initBalance:Double) extends BankAccount (initBalance){

  override def deposit(amount: Double): Double = super.deposit(amount-1)

  override def withdraw(amount: Double): Double = super.withdraw(amount-1)
}

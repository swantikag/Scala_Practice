class BankAccount {
  private var balance = 0D
  def  deposit(amount:Double): Unit ={
    this.balance+=amount
  }

  def withdraw(amount:Double): Unit ={
    this.balance-=amount
  }

  def viewBalance:Double=balance
}


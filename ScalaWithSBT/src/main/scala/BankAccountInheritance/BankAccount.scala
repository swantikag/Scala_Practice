package BankAccountInheritance

class BankAccount(initialBalance:Double) {
  private var balance = initialBalance
  def deposit(amount:Double)={this.balance+=amount;this.balance}
  def withdraw(amount:Double)={this.balance-=amount;this.balance}
  def viewBalance=this.balance
}


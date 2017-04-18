package jin.caption8

/**
  * Created by jin on 2017/4/2.
  */
class BankAccount(initialBalance:Double) {

  private var balance = initialBalance

  def deposit(amount:Double):Double = {
    balance += amount
    balance
  }
  def withdraw(amount:Double):Double = {
    balance -= amount
    balance
  }
}
class CheckingAccount(initialBalance:Double) extends BankAccount(initialBalance){

  override def deposit(amount: Double): Double = super.deposit(amount -1 )

  override def withdraw(amount: Double): Double = super.withdraw(amount - 1)
}

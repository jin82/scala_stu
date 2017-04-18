package jin.capation5

/**
  * Created by jin on 2017/4/2.
  */
class BankAccount {

  private val balance = true

  private var in = 0

  private var out = 0

  def deposit(in:Int): Unit ={
    this.in += in
  }

  def withDraw(out:Int): Unit ={
    this.out += out
  }

  def isBalance : Boolean={
    in == out
  }
}


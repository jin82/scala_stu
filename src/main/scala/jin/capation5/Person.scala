package jin.capation5

/**
  * Created by jin on 2017/4/2.
  */
class Person {

  private var privateAge = 0

  def age = privateAge

  def age_=(newValue:Int): Unit ={
    privateAge = newValue
  }

}

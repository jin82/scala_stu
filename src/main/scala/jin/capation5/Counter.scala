package jin.capation5

/**
  * Created by jin on 2017/4/2.
  */
class Counter {

  private var value = 0

//  def current() = value

  def v_=(v:Int): Unit ={
    value = v
  }

  def v = value

  def incurrent {
    if(v < Int.MaxValue) {
      value += 1
    }
  }


}



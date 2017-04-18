package jin.capation5

/**
  * Created by jin on 2017/4/2.
  */
class Timer(private var hrs:Int,private var min:Int) {

  def before(other:Timer) : Boolean = {
    if(other.hrs > this.hrs){
      true
    }else if(other.hrs < this.hrs){
      false
    }else{
      if(other.min > this.min)
        true
      else
        false
    }

  }

  def hour = hrs

  def minute = this.min

}

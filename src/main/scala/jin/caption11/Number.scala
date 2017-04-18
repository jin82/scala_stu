package jin.caption11

/**
  * Created by jin on 2017/4/3.
  */
class Number(private val v:Int) {

  def +(that:Number):Number = {
    new Number(this.v + that.v)
  }

  def ->(that:Number) : Int ={
    that.v - this.v
  }

  def ==>() : Int = {
    this.v
  }

  def ~() :Int ={
    this.v
  }

}
object Number extends App{

  var ten = new Number(10)
  var one = new Number(1)

  var and = ten + one
  var step = one -> ten
//  println(~and)


}

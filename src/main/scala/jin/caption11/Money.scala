package jin.caption11

/**
  * Created by jin on 2017/4/4.
  */
class Money(private val yuan:Int,private val feng:Int) {

  def +(that:Money):Money = {
    new Money(this.yuan + that.yuan,this.feng + that.feng)
  }

  def -(that:Money) :Money = {
    new Money(this.yuan - that.yuan ,this.feng - that.feng)
  }

  def ==(that:Money) : Boolean = {
    if (this.yuan == that.yuan && this.feng == that.feng) true else false
  }



}
object Money extends App{

  def apply(yuan:Int): Money = new Money(yuan,0)

  def update(yuan:Int,t:Int): Unit = {
    println(yuan * t)
  }

  def ~(yuan:Int): Unit ={
    println(-yuan)
  }


  def unapply(arg: Money): Option[(Int, Int)] = {
    if (arg.yuan < 0 ) None else Some(arg.yuan,arg.feng)
  }

  var a = new Money(10,5)
  var b = Money(1)

  var same = a + b == new Money(11,5)
  println(same)

  Money(60) = 5

  var Money(c,d) = Money(10)
  println(s"$c,$d")




}

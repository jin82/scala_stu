package jin.caption2

import scala.collection.immutable.StringOps

/**
  * Created by jin on 2017/3/29.
  */
class Exam {
  def main(): Unit = {
    exam1(33)
    exam1(-2)
    exam1(0)
    exam4()
    countdown(4)
    val point = exam6("Hello")
    println(point)
    val point2 = exam6StringOps("Hello")
    println(point2)
  }
  def exam1(num:Int): Unit = {
      var signum = if (num >0) 1 else if (num < 0) -1 else 0
      println(signum)
  }

  def exam4(): Unit ={
    for(x <- 10.to(0,-1)) {
      println(x)
    }
  }

  def countdown(n:Int): Unit = {
    if (n > 0) {
      println(n)
      countdown(n - 1)
    }
  }

  def exam6(str:String):Long ={
    var count = 1
    for(x <- 0 until str.length){
      val a = str(x)
      println(a.toInt)
      count *= a.toInt
    }
    count
  }

  def exam6StringOps(str:String):Long = {
    var ops = new StringOps(str)
    var count = 1
    ops.foreach(u=>count *= u)
    count
  }


}

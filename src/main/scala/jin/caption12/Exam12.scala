package jin.caption12

import scala.collection.mutable.ArrayBuffer

/**
  * Created by jin on 2017/4/4.
  */
class Exam12 {

}

object Exam12 extends App{


  var r = values(x=>x*x,-5,5)
  println(r.mkString(","))

  var t = Array(5,4,6,3,2,1)
  var t1 = t.reduceLeft((a,b) => if(a>b)a else b)
  println(t1)

  def values(fun:(Int) =>Int ,low:Int,high:Int) : Array[(Int,Int)] = {
    var result = new ArrayBuffer[(Int,Int)]()
    for(i <- low to high){
      val tuple = (i,fun(i))
      result += tuple
    }
    result.toArray
  }

  println(1 to 10 reduceLeft(_*_))

  println( (1 to -10 foldLeft 1)(_ * _))

  def largest(fun:(Int) => Int,inputs:Seq[Int]): Unit = {
    var newInputs = inputs.reduceLeft((a,b) => if (fun(a) >fun(b)) a else b)
    println(fun(newInputs))
  }

  largest(x => 10 * x - x * x,1 to 10)

  val pairs = (1 to 10) zip (11 to 20)
  println(pairs.mkString("."))
  def adjustToPair(fun:(Int,Int) => Int):((Int, Int))=> Int ={
    (a:(Int, Int)) => fun(a._1,a._2)
  }

  def adaa(fun:(Int,Int) => Int)(p:((Int, Int)) => Int) = {
     (a:(Int, Int)) => fun(a._1,a._2)
  }

  val pair = adjustToPair(_*_)(6,7)
//  val aa1 = adaa(_*_)((6,7))
  println(s"pair = ${pair}")
//  println(s"aa1 = ${aa1}")

  val sq = 1 to 10
  sq.sum

  var too = pairs.map(a=>adjustToPair(_+_)(a))
  println(too.mkString(","))


  val intArr = Array(2,4,5)
  var strArr = Array("as","beef","hello")

  var same = intArr.corresponds(strArr)(_ == _.length)
  println(same)

  def unless(p: =>Boolean)(block: => Unit): Unit ={
    if(!p){
      block
      unless(p)(block)
    }
  }

}

package jin.caption4

import java.util.Scanner

import scala.collection.{SortedMap, mutable}
import scala.collection.immutable.{HashMap, SortedSet}


/**
  * Created by jin on 2017/4/2.
  */
object Test {
  def main(args: Array[String]): Unit = {
//    exam1()
//    exam2()
//    var t = mainmax(3,4,1,3,5,6,4,2,1)
//    println(t)
    zipit()
  }


  def exam1(): Unit ={
    var myThings = Map("手机"->5300,"平板"->900,"电脑"->4600,"MBP"->12000)
    var discountMyThings = for((k,v) <- myThings) yield (k,0.9*v)
    println(myThings.mkString(" "))
    println(discountMyThings.mkString(" "))
  }

  def exam2(): Unit ={
    var count = new collection.mutable.HashMap[Char,Int]

    var scanner = new Scanner(System.in)
    while (scanner.hasNext()){
      var text = scanner.nextLine()
      for(a <- text){
        var c = count.getOrElse(a,0)
        count(a) = c+1
      }
      println(count.mkString(","))
    }
  }

  def mainmax(values:Int*):(Int, Int) = {
    var newVs = values.sortWith(_>_)
    println(newVs.mkString(","))
    (newVs head,newVs last)
  }

  def zipit(): Unit ={
    var a = "Hello".zip("World")
    println(a.mkString(","))
  }
}

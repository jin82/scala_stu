package jin.caption3

import java.util.TimeZone

import scala.collection.mutable.ArrayBuffer
import scala.util.{Random, Sorting}

/**
  * Created by jin on 2017/3/30.
  */
object Exam3 {

  def exam1(n:Int):Array[Int] = {
    var a = new Array[Int](n)
    val r = new Random()
    for(index <- a.indices) {
      a(index) = r nextInt n
    }
    a
  }
  def testExam1(): Unit ={
    val result = exam1(6)
    result.foreach(a=>println(a))
  }

  def exam2(x:Array[Int]): Array[Int] ={
    if(x.length > 1){
      for(i <- 0 until (x.length,2) if i+1<=x.length-1) {
        val temp = x(i)
        x(i) = x(i+1)
        x(i+1) = temp
      }
    }
    x
  }

  def exam3(x:Array[Int]): Array[Int] ={
    var r = ArrayBuffer[Int]()
    var forResult = for(i <- 0 until (x.length,2) if i+1<=x.length-1) yield {
        var t = new ArrayBuffer[Int]()+= x(i+1)
        t +=  x(i)
        t
    }
    forResult.foreach(x=> r ++= x)
    r.toArray
  }

  def exam4(x:Array[Int]):Array[Int] ={
    val positive = new ArrayBuffer[Int]()
    val minus = new ArrayBuffer[Int]()
    x.foreach(n => if(n>0) positive += n else minus += n)
    positive ++= minus
    positive toArray
  }

  def exam5(x:Array[Double]):Double={
    x.sum / x.length
  }

  def exam6(x:Array[Int]): Array[Int] = {
    x.sortWith(_>_)
  }
  def exam7(x:ArrayBuffer[Int]): ArrayBuffer[Int] ={
    x.sortWith(_>_)
  }

  def exam8(x:Array[Int]) :Array[Int]={
    x.distinct
  }

  def exam9(): Unit = {
    val zones = TimeZone.getAvailableIDs
    val t = zones.filter(_.startsWith("America/")).map(z => z.substring(8,z.length))
    println(t.mkString(","))
  }

  def main(args: Array[String]): Unit = {
//    testExam1()
//    val t = exam2(Array(1,2,3,4,5,6))
//    print(t mkString ",")
    val t2 = exam3(Array(1,2,3,4,5,6))
    println(t2 mkString ",")

    val t3 = exam4(Array(4,3,-2,3,0,43,-3,-4,2,43,-9))
    println(t3.mkString(","))

    val t5 = exam5(Array(2.5,2.5,2.5,5.5,5.6))
    println(t5)

    val testArray = Array(4,3,-2,3,0,43,-3,-4,2,43,-9)
    var result1 = exam6(testArray)
    println(result1.mkString(","))
    val testArray2 = ArrayBuffer[Int](4,3,-2,3,0,43,-3,-4,2,43,-9)
    val result2 = exam7(testArray2)
    println(result2.mkString(","))
    val x1 = Array[Int](1,2,3,4,5,3,2,5,3,2,1)
    val t1 = exam8(x1)
    println(t1.mkString(","))
    exam9()
  }


}

package jin.caption13

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
  * Created by jin on 2017/4/9.
  */

class Exam13{
  def +:(x:String): Unit ={
    print(x)
  }
}
object Exam13 extends App{

  def exam1(str:String): Unit = {
    var result = new mutable.HashMap[Char,mutable.TreeSet[Int]]
    for(i <- 0 until  str.length) {
      var c = str.charAt(i)
      var set = result.get(c)
      var s = set.getOrElse(new mutable.TreeSet[Int]())
      s.add(i)
      result.put(c,s)
    }
    val r = result.mkString(",")
    println(r)
  }

  def exam2(str:String): Unit = {
//    var r = new collection.immutable.HashMap[Char,collection.immutable.TreeSet[Int]]
//    for(i <- 0 until str.length ) {
//      val c = str.charAt(i)
//      val s = r.get(c)
//      var ss = s.getOrElse(new collection.immutable.TreeSet[Int]())
//      ss ++= collection.immutable.TreeSet[Int](i)
//      r ++= collection.immutable.HashMap[Char,collection.immutable.TreeSet[Int]](c,ss)
//    }
//    val t = r.mkString(",")
//    println(t)

  }

  exam1("Mississippi")
//  exam2("Mississippi")

  exam3(mutable.LinkedList[Int](4,3,5,1,0,1,0,9))

  def exam3(list:mutable.LinkedList[Int]): Unit ={
    val newList = list.filter(_!=0)
    println(newList.mkString(","))
  }

  def exam4(arr:Array[String],map:mutable.Map[String,Int]): Array[Int]= {
    val a = arr.filter(map.contains)
    val b = a.flatMap(map.get)
    b
  }
  var a = exam4(Array("Tom","Fred","Harry"),mutable.Map[String,Int]("Tom" -> 3,"Dick"-> 4,"Harry"->5))
  println(a.mkString(","))

  def makeString(list:List[String]):String = {
    list.reduceLeft((a,b) => a+","+b)
  }
  println(makeString(List[String]("2","3","4")))

  def exam6(list:List[Int]): Unit ={
    println((list:\List[Int](4,5))(_::_).mkString(","))
    println((List[Int](4,5)/:list)(_:+_).mkString(","))
    println((List[Int]()/:list)((a,b) => b+:a).mkString(","))
  }

  exam6(List(1,2,3))

  val exam13 = new Exam13
  "This is a "+:exam13

  def exam7(): Unit ={
    val prices = List(5.0,20.0,9.95)
    val quantities=List(10,2,1)
    val t = prices zip quantities
    println(t.mkString(","))

    val x = t.map(Function.tupled(_*_))
    println(x.mkString(","))
  }
  exam7()

  def exam8(arr:Array[Double],line:Int): Unit = {
    val iterator = arr.grouped(line)
    val r = new ArrayBuffer[Array[Double]]()
    iterator.foreach(r append _)
    println(r.mkString(","))
  }
  exam8(Array(1,2,3,4,5,6),3)

//  def exam9(str:String): Unit ={
//    val t = str.par.aggregate(new mutable.HashMap[Char,Int]())((map,c) => {map(c) = map.getOrElse(c,0)+1;map},{
//      (m1,m2) => {
//        ((m1.keySet ++ m2.keySet) foldLeft mutable.HashMap[Char, Int]()){
//          (map,char) => {
//            val resultMap = map + (char -> (m1.getOrElse(char,0) + m2.getOrElse(char,0)))
//            val xx = mutable.HashMap[Char,Int]()
//            resultMap.foreach({xx.put(_,_);Unit})
//            xx
//          }
//        }
//      }
//    })
//  }
//  exam9("aaabcuedeeee")
}

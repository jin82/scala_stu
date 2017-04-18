package jin

import scala.collection.mutable
import scala.io.StdIn

/**
  * Created by jin on 2017/4/2.
  */
package object caption7 {

  private var seed = 1

  def setSeed(seed:Int): Unit ={
    this.seed = seed
  }

  def nextInt():Int = {
    nextDouble().toInt
  }

  def nextDouble():Double = {
    val a = BigDecimal(seed * 1664525 + 1013904223)
    (a % BigDecimal(2).pow(32)) toDouble
  }

}

object TestPackage extends App{


  println(caption7.nextDouble())
  println(caption7.nextInt())


  import collection.mutable.HashMap
  import java.util.{HashMap => javaHashMap}

  var javaMap = new javaHashMap[String,String]()
  var hashMap = new HashMap[String,String]()
  javaMap.put("1","1")
  for(k <- javaMap.keySet().toArray()){
    hashMap += (k.toString->javaMap.get(k))
  }
  println(hashMap.mkString(","))
}
object anotherTest extends App{

  import java.lang.System._
  import scala.io.StdIn._
  var user = getProperty("user.name")
  var t = readLine("请输入哦")
  if (t == "secret")
    print("Hello")
}
package jin.caption8

import scala.collection.mutable.ArrayBuffer

/**
  * Created by jin on 2017/4/2.
  */
abstract class Item {
  def price:Double

  def description : String

}
class SimpleItem(p:Double,d:String) extends Item{
  override def price: Double = p

  override def description: String = d
}
class Bundle extends Item{
  val items = new ArrayBuffer[Item]

  def add(item:Item): Bundle ={
    items += item
    this
  }

  override def price: Double = {
    var p:Double = 0
    items.foreach(p += _.price)
    p
  }

  override def description: String = {
    ""
  }
}
object TestAbs extends App{
  var a = new SimpleItem(20,"a")
  var b = new SimpleItem(25,"b")
  var c = new Bundle
  c add a add b
  println(c price)
}

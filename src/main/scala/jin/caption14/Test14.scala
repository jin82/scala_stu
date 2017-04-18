package jin.caption14

/**
  * Created by jin on 2017/4/16.
  */
abstract class Item
case class Article(description:String,price:Double) extends Item
case class Bundle(description:String,discount:Double,items:Item*) extends Item
case class Multiple(size:Int,item:Item,cost:Double) extends Item

object Test14 extends App{


  def exam2(t:(Int,Int)):(Int,Int) = {
    t match {
      case (a:Int,b:Int) => (b,a)
    }
  }

  def swap(array:Array[Int]): Array[Int] ={
    array match {
      case Array(one,two,arr @ _*) => Array(two,one) ++ arr
      case _ => array
    }
  }
  println(exam2((4,5)))

  val b = Array(4)
  val bswap = swap(b)
  val c = Array(4,6,7,8,0)
  val cswap = swap(c)
  println(bswap.mkString(","))
  println(cswap.mkString(","))


  def price(it:Item):Double = {
    it match {
      case Article(_,p) => p
      case Bundle(_,p,items @ _*) =>  items.map(price).sum * p
      case Multiple(s,i,cost) => price(i)*s+cost
    }
  }


  def exam5(tree:List[Any]) : Int = {
    println{"abc"}
    var total = 0
    tree.foreach {
      case leaf:Int => total += leaf
      case node:List[Any] => total += exam5(node)
    }
    total
  }
  val total = exam5(List(List(3,8),2,List(5)))
  println(total)


}

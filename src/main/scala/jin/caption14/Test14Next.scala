package jin.caption14

/**
  * Created by jin on 2017/4/17.
  */
sealed abstract class BinaryTree
case class Leaf(value:Int) extends BinaryTree
case class Node(left:BinaryTree,right:BinaryTree) extends BinaryTree
case class Symbol(c:Char,nodes:BinaryTree*) extends BinaryTree

object Test14Next extends App{

  def exam6(binaryTree: BinaryTree):Int={
    var total = 0
    binaryTree match {
      case Leaf(value) => total += value
      case Node(l,r) => total = total + exam6(l) + exam6(r)
    }
    total
  }

  val tree = Node(Node(Leaf(4), Leaf(5)), Leaf(7))
  val total = exam6(tree)
  println(total)

  def eval(binaryTree: BinaryTree) : Int = {
    var total = 0

    binaryTree match {
      case Leaf(v) => total += v
      case Symbol(c,leafs @ _*) => c match {
        case '+' => leafs.map(eval).sum
        case '-' => leafs.map(eval).foldLeft(0)(_-_)
      }
    }

    total
  }

  def exam9(list :List[Option[Int]]) : Int = {
    list.map(_.getOrElse(0)).sum
  }

  import scala.math.sqrt
  def f(x : Double) = if ( x >= 0) Some(sqrt(x)) else None
  def g(x : Double) = if ( x != 1) Some( 1 / ( x - 1)) else None

  def compose(f:(Double) => Option[Double],g:(Double) => Option[Double]) : (Double) => Option[Double] = {
    (x:Double) => if(f(x) == None || g(x) == None) None else g(x)
  }

  val r = compose(f,g)
  println(r(2))
  println(r(1))
  println(r(0))

}

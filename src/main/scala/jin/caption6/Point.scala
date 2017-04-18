package jin.caption6

/**
  * Created by jin on 2017/4/2.
  */
class Point(x:Int,y:Int) {
  override def toString: String = "("+x+","+y+")"
}
object Point extends App{
  def apply(x: Int, y: Int): Point = new Point(x, y)
  println(Point(20,10))
}

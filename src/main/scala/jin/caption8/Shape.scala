package jin.caption8

/**
  * Created by jin on 2017/4/3.
  */
abstract class Shape {

  def centerPoint():(Float,Float)
}

class Retangle(length:Int,width:Int) extends Shape{
  override def centerPoint(): (Float, Float) = {
    (length/2,width/2)
  }

}
class Circle(redius:Int) extends Shape{
  override def centerPoint(): (Float, Float) = {
    (redius,redius)
  }
}

object Shape extends App{
  var r = new Retangle(10,10)
  var t = new Circle(10)

  println(r.centerPoint())
  println(t.centerPoint())
}
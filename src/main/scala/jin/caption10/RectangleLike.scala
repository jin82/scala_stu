package jin.caption10

import java.awt.geom.Ellipse2D

/**
  * Created by jin on 2017/4/3.
  */
trait RectangleLike {

  this: Ellipse2D.Double =>

  def translate(x:Int,y:Int): Unit ={
    this.x = x
    this.y = y
  }

  def grow(x:Int,y:Int): Unit ={
    this.x += x
    this.y += y
  }
}
object RectangleLike extends App{

  var egg = new Ellipse2D.Double() with RectangleLike

}

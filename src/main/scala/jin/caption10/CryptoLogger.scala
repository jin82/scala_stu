package jin.caption10

import java.awt.Point
import java.beans.PropertyChangeSupport

/**
  * Created by jin on 2017/4/3.
  */
class CryptoLogger extends Logger{

  val key = 3

  override def log(log: String): Unit = {
    println("+"+log+"+"+key)
  }
}
class MyLogger extends CryptoLogger{
  override val key = 5
}

trait PropertyChangeLike extends PropertyChangeSupport{

}

trait Language{
  val name:String = ""
  def year():Unit
}
trait ShowAble{
  this: Language =>
  def show(): Unit ={
    println(this.name)
  }
}
class Java extends Language{
  override val name: String = "JAVA"

  override def year(): Unit ={
    println(1995)
  }
}
object MyLogger extends App{
  var logger = new MyLogger
  logger.log("Hello")
  var next = new CryptoLogger{
    override val key = 9
  }
  next.log("VVVV")

//  var p = new Point() with PropertyChangeLike

  var j = new Java
  j.year()
  var ja = new Java with ShowAble
  ja.show()

}


package jin.caption15

import scala.annotation.varargs
import scala.io.Source

/**
  * Created by jin on 2017/4/17.
  */

class Test15{
  @deprecated
  val at = 0

  @deprecated def a(): Unit ={

  }
}
object Test15 {

  @varargs
  def sum(nums:Int*) : Int = {
    nums.sum
  }

  def read():String = {
    val f = Source.fromFile("/Users/wq/Documents/settings.xml","UTF-8")
    val lines = f.getLines()
    if (lines.hasNext) {
      lines.next()
    }
    ""
  }

}

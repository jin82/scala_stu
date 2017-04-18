package jin.caption10

import java.awt.Point

/**
  * Created by jin on 2017/4/3.
  */
class OrderedPoint extends Point with math.Ordered[Point]{
  override def compare(that: Point): Int = {
    if(this.x <= that.x && this.y<that.y)
      -1
    else if(this.x == that.x && this.y == that.y)
      0
    else
      -1
  }
}

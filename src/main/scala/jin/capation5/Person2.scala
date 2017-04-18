package jin.capation5

/**
  * Created by jin on 2017/4/2.
  */
class Person2(private var a:Int) {
  if(a<0) {
    a = 1
  }
  def age = this.a
}

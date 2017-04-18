package jin.capation5

import scala.collection.immutable.StringOps

/**
  * Created by jin on 2017/4/2.
  */
class Person3(fullName:StringOps) {

  private val ops = fullName.split(" ")

  private val _firstName = ops(0)

  private val _lastName = ops(1)

  def firstName = _firstName

  def lastName = _lastName

}

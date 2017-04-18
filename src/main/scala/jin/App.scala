package jin

import jin.caption2.Exam

import math._
/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)
  
  def main(args : Array[String]) {
    println("Hello World!")
    max(5, 7)
    var exam = new Exam
    exam.main()
  }

}

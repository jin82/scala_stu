package jin.caption9

import java.io.PrintWriter

import scala.io.Source

/**
  * Created by jin on 2017/4/3.
  */
object Test9 extends App{

//  exam1()
//  exam2()
  exam3()
  def exam1(): Unit ={
    var path = "/Users/wq/Documents/zz_site_app.properties"
    var newFile = "/Users/wq/Documents/aaa.txt"
    var file = Source.fromFile(path)
    var lines = file.getLines().toArray.reverse
    var out = new PrintWriter(newFile)
    lines.foreach(s=>out.println(s))
    out.close()
  }

  def exam2(): Unit ={
    var path = "/Users/wq/Documents/aaa.txt"

    val reader = Source.fromFile(path,"UTF-8").getLines()

    val result = for ( t <- reader) yield t.replaceAll("\\t","    ")

    val pw = new PrintWriter(path)

    result.foreach(line => pw.write(line + "\n"))

    pw.close()

  }

  def exam3(): Unit ={
    var path = "/Users/wq/Documents/zz_site_app.properties";Source.fromFile(path).mkString.split("\\s+").foreach(s => if(s.length >12) println(s))

  }



}

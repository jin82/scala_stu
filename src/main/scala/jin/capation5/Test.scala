package jin.capation5


/**
  * Created by jin on 2017/4/2.
  */
object Test {
  def main(args: Array[String]): Unit = {
//    exam2()
//    exam3()
//    exam4()
//    exam5()
    exam6()
  }

  def exam1(): Unit ={
    var counter = new Counter
    counter.v = Int.MaxValue
    counter.incurrent
    println(counter.v)
  }

  def exam2(): Unit ={
    var account = new BankAccount
    account.deposit(50)
    account.withDraw(30)
    account.withDraw(20)
    var result = account.isBalance
    println(result)
  }

  def exam3(): Unit ={
    val now = new Timer(10,10)
    val tommor = new Timer(14,14)
    val thr = new Timer(9,14)
    val before = now.before(tommor)
    val after = now.before(thr)
    println(before)
    println(after)
  }

  def exam4(): Unit ={
    var p = new Person2(-5)
    println(p.age)
  }

  def exam5(): Unit = {
    var p = new Person3("King Jin")
    var f = p.firstName
    var l = p.lastName
    println("first name is " + f + ",last name is " + l)
  }

  def exam6(): Unit ={
    var c = new Car("中国","大型")
    var d = new Car("中国","大型",20)
    var e = new Car("中国","大型",20,"kkk")
    var f = new Car("中国","大型",cp = "kkk")

    println(s"this is $c,$d,$e,$f")
  }
}

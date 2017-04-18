package jin.caption6

/**
  * Created by jin on 2017/4/2.
  */
object Pocker extends Enumeration{

  val spade = Value(0,"♠️")
  val heart = Value(1,"♥️️")
  val club = Value(2,"♣️️")
  val diamond = Value(3,"方块")


}
object PockerTest extends App{

  for(p <- Pocker.values){
    println(p)
  }

  println(isRed(Pocker.diamond))

  def isRed(card:Pocker.Value):Boolean = {
    if(card == Pocker.spade || card == Pocker.club)
      false
    else
      true
  }

}


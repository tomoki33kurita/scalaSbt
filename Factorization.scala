import scala.math.sqrt

object Factorization extends App {
  var target = 510510
  val maxDivisor = sqrt(target).toInt // .toIntメソッドで Double型からInt型に変換している

  def factorizationRec(num: Int, divisor: Int, acc: Map[Int, Int]): Map[Int, Int] = {
    if(divisor > maxDivisor){
      if(num == 1) acc else acc + (num -> 1)
    } else if(num % divisor == 0) { // num:10 , divisor:2
      val nextAcc = acc + (divisor -> (acc.getOrElse(divisor, 0) + 1)) // 2->1
      factorizationRec(num / divisor, divisor, nextAcc) // (5, 2, Map(2->1))
    } else {
      factorizationRec(num, divisor + 1, acc)
    }
  }

  println(factorizationRec(target, 2, Map()))
}
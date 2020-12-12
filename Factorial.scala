import scala.math.BigInt

object Factorial extends App {
  def factorial(i: BigInt): BigInt = if (i == 0) 1 else i * factorial(i - 1)
  println(factorial(1000))
}

// 関数の宣言は def から始める
// Scalaには独特の if式 という記述方式がある。三項演算子みたいなもの
// 非常に大きな整数を扱う際には、 BigInt を利用する
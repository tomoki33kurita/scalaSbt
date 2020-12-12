object Distance extends App {
  val kilometersPerHours = 11.0
  val minutes = 100.0
  val distance = kilometersPerHours * minutes / 60.0
  println(s"走った距離は${distance}キロメートルです")
}

// val は JavaScriptで言うところの const に似た性質を持つ
// 文字列の中に変数をリテラルで埋め込む場合、JSだとバッククォーテーションで囲っていたが、Scalaだと先頭にsを付ける
// Scala では、整数同士の割り算の結果では、小数点以下の値は無視されてしまう
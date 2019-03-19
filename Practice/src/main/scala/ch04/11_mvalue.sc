/*5.11 Case 语句的中置表达式
如果 unapply 方法产出一个元组，你可以在 case 语句中使用中置表示
法。比如可以匹配一个 List 序列，可以如下表示：
*/
case class Currency(value: Double, unit: String)

val amt = Currency(1000.0, "EUR")

//中置表达式
amt match {
    case a Currency u => a + " " + u
}

val list = List(1, 2, 3, 4)
list match {
    case h :: t => println(h); println(t.length)
    case _ => 0
}

list match {
    case ::(h, t) => println(h); println(t)
    case _ => 0
}
//::将元素添加到List的最前面
List(1, 7, 2, 9) match {
    case first :: second :: rest => println(first); println(second); println(rest)
    case _ => 0
}

List(1, 7, 2, 9) match {
    case ::(first, ::(second, rest)) => println(first); println(second); println(rest)
    case _ => 0
}

List(List(1, 7), List(2, 9)) match {
    case (first :: second) :: rest1 => println(first); println(second); println(rest1)
    case _ => 0
}

case object +: {
    def unapply[T](input: List[T]) = {
        if (input.isEmpty) None else Some((input.head, input.tail))
    }

}

1 +: 7 +: 2 +: 9 +: Nil match {
    case first +: second +: rest => println(first); println(second); println(rest)
}

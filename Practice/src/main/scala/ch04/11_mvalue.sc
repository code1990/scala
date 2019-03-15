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

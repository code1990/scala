/*
5.1 更好的 switch
Scala 中的 switch 语句如下：

与 default 等效的是捕获所有的 case_ 模式。如果没有模式匹配，抛出
MatchError，每个 case 中，不用 break 语句。
和 if 一样，match 也会返回值：
你可以在 match 中使用任何类型，而不仅仅是数字。
*/
var sign =0
for(ch <- "+-!"){
    ch match {
        case '+'=>sign=1
        case '-'=>sign = -1
        case _ => sign =0
    }
    println(sign)
}


for(ch <- "+-!"){
    sign = ch match {
        case '+'=>1
        case '-'=> -1
        case _ => 0
    }
    println(sign)
}

import java.awt._

val color = SystemColor.textText

color match {
    case Color.RED =>"Text is red"
    case Color.BLACK=>"Text is black"
    case _ =>"Not red or Black"
}




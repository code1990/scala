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




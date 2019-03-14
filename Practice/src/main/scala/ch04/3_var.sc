val str = "+-3!"
//返回str的一组索引Range
for(i<-str.indices){
    var sign = 0
    var digit =0
    str(i) match{
        case '+'=>sign = 1
        case '_'=>sign = -1
        case ch if Character.isDigit(i)=>digit=Character.digit(ch,10)
        case _ =>
    }
    println(str(i) + " " + sign + " " + digit)
}

import scala.math._
val x = random
x match {
    case Pi =>"it's PI"
    case _ =>"it's not PI"
}

//变量必须小写字母开头 常量大写字母开头 常量小写加`3
import java.io.File._
str match {
    case `pathSeparator` =>"It's the pathSeparator"
    case _ => "It's not the pathSeparator"
}
//如果匹配 则把字符转换成10进制
/*5.2 守卫
像 if 表达式一样，match 也提供守卫功能，守卫可以是任何 Boolean 条
件：
*/
for(ch <- "+-3!"){
    var sign =0
    var digit =0
    ch match{
        case '+'=>sign = 1
        case '-'=>sign = -1
        case _ if Character.isDigit(ch)=>digit = Character.digit(ch,10)
        case _ => sign = 0
    }
    println(ch +" "+sign+" "+digit)
}

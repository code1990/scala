import scala.collection.mutable

val s = new mutable.Stack[Int]()

//入栈
s.push(1)
//入栈多个元素
s.push(2,3,4)
//出栈
s.pop()

s

s.push(5)

//获取栈顶元素而出栈
s.top

s

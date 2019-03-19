/*3.3 for 表达式
Scala 也为 for 循环这一常见的控制结构提供了非常多的特性，这些 for
循环的特性被称为 for 推导式（for comprehension）或 for 表达式（for
expression）。
推导式一词起源于函数式编程。
像 变量名 <- 集合 这样的表达式也被称为生成器表达式，该表达式会
基于集合生成单独的数值。
保护式，也叫守卫，可以添加一个或者多个守卫，不需要 continue 语句
For 推导式可以引入变量
需要返回值怎么办？
使用 yield 关键字便能在 for 表达式中生成新的集合。for-yield 表达式所
生成的集合类型将根据被遍历的集合类型推导而出。
{}和()对于 for 表达式来说都可以。for 推导式有一个不成文的约定：当
for 推导式仅包含单一表达式时使用原括号，当其包含多个表达式时使用大括
号。值得注意的是，使用原括号时，早前版本的 Scala 要求表达式之间必须
使用分号。
*/
//多个变量生成器
for(i <- 1 to 3;j<- 1 to 3)print((10*i+j)+" ")

//守卫模式
for(i <- 1 to 3;j<- 1 to 3;if i !=j)print((10*i+j)+" ")

//多个守卫模式
for(i <- 1 to 3;j<- 1 to 3;if i !=j; if j <2)print((10*i+j)+" ")

//引入变量
for(i <- 1 to 3;from = 4-i;j<- from to 3;if i !=j; if j <2)print((10*i+j)+" ")

//使用变量
for(i <- 1 to 3;from = 4-i)print(from+" ")

//()变成{}都可以
for{i<-1 to 3
    from = 4-i
    j <- from to 3
}print((10*i+j)+" ")

//yield将输出到集合 这种类型叫做for推导式
val result = for(i <- 1 to 10)yield i*3

result

//for推导式返回的类型和第一个生成器的类型是兼容的
for(c<-"Hello";i<- 0 to 1)yield (c+i).toChar

for(i <- 0 to 1;c<-"Hello")yield (c+i).toChar





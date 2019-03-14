//切片操作返回一个迭代器
val iter1 = (1 to 10).sliding(3)

while (iter1.hasNext)println(iter1.next())

val iter2 = (1 to 10).sliding(3)

for(elem <- iter2)print(elem)

val iter3 = (1 to 10).sliding(3)

//执行length操作 会消费迭代器
println(iter3.length)

println(iter3.hasNext)

val iter4 = (1 to 10).sliding(3)

//返回迭代器数组
iter4.toArray




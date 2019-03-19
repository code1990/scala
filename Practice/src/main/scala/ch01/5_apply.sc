//获取字符串
/*2.5 apply、update 方法
apply 方法是调用时可以省略方法名的方法。用于构造和获取元素
在 StringOps 中你会发现一个 def apply(n: Int): Char 方法定义。
update 方法也是调用时可以省略方法名的方法，用于元素的更新，
arr(4) = 5 等同于 arr.update(4,5)

*/
"Hello"(4)
//apply获取字符
"Hello".apply(4)

//声明数组
val array = Array(1,2,3)
//apply声明数组
Array.apply(1,2,3)
BigInt("1234567")
BigInt.apply("1234567")
BigInt("1234567")*BigInt("1234567")

//更新值
array(1)=3

array

//update方法更新值
array.update(1,4)

array





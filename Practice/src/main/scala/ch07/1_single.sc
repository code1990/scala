/*8.1 单例对象
Scala 中没有静态方法和静态字段， 你可以用 object 这个语法结构来达到
同样的目的。

对象的构造器在该对象第一次使用时调用。如果对象没有使用过，他的
构造器也不会被执行。
对象基本具有类的所有特性，就是一点，你不能设置构造器的参数。

*/
object Accounts {
    println("init")
    private var lastNumber = 0;
    val abc = "wu"
    def newUniqueNumber()={lastNumber+=1;lastNumber}
}
Accounts.newUniqueNumber()
Accounts.newUniqueNumber()
Accounts.abc


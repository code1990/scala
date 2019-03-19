/*8.2 伴生对象
Java 中会有类既有实例方法又有静态方法的类。Scala 中可以通过伴生对
象进行实现。
类和它的伴生对象可以相互访问私有特性，他们必须存在同一个源文件
中。必须同名

*/
class Account{
    val id = Account.newUniqueNember()
    private var balance = 0.0
    def deposit(amount:Double){balance+=amount}
    def description = "Account"+id+"with balance"+balance
}
object Account{
    private var lastNumber =0
    private def newUniqueNember() = {lastNumber+=1;lastNumber}
}

val acct1 = new Account
val acct2 = new Account
acct1.deposit(1000)
val d1 = acct1.description
val d2 = acct2.description

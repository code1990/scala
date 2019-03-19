/*8.3 Apply 方法
我们通常会定义和使用对象的 apply 方法，当遇到如下形式时：
Object(参数 1、参数 2、参数….)
会调用 apply 方法。Apply 方法一般都声明在伴生对象中。
*/
Array.apply("Mary","had","a","little","money")
Array(Array(1,2),Array(3,4))
Array(100)
new Array(100)

class Account private(val id:Int,initialBalance:Double){
    private var balance = initialBalance
    def deposit (amount:Double){balance+=amount}
    def description = "Account"+id+"with balance"+balance
}

object Account{
    private var lastNumber =0
    private def newUniqueNumber() = {lastNumber+= 1;lastNumber}
    def apply(initialBalance:Double)
        = new Account(newUniqueNumber(), initialBalance)

}
val acct = Account(1000.0)
val d = acct.description

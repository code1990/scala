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

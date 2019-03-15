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

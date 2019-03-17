def getMiddle[T](a:Array[T])=a(a.length/2)

getMiddle(Array("Mary","had","a","little","lamb"))

val f = getMiddle[String]

f(Array("Mary", "had", "a", "little", "lamb"))
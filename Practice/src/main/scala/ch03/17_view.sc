import scala.math._

//通过view的懒操作
val palindromicSquares = (1 to 10).view.map(x =>{println(x);x*x})

palindromicSquares.take(10).mkString(",")

def sqaures(x:Int):Stream[Int]={println(x);x*x}#::sqaures(x+1)
val palindromicSquareSteam = sqaures(0)

palindromicSquareSteam(10)

palindromicSquares.take(10).last

palindromicSquares(10)






var r =1
var n =10
//while循环
while (n>0){
    r = r*n
    n -=1
    println(r)
}
r=1
n=10
//do while循环
do{
    r = r*n
    n-=1
    println(r)
}while(n>0)

import scala.util.control.Breaks._
//break
r=1
n=10
breakable{
    while (n >0){
        r = r*n
        n -=1
        println(r)
        if(r==720)break
    }
}
val x =0

//if else结构
if(x>0)x else -1

//可以有返回值
val s = if(x >0) 1 else -1

//类型不一样时候 返回公共类Any
if(x >0) "positive" else -1
//如果没有返回值则返回Unit相当于void 使用()表示
if(x >0)1
if(x>0) 1 else ()

//是否需要分号
var n =10
var r =1
//如果多行表达式 写在一行则需要分号
//单个表达式 可以不用大括号
if(n>0){r = r*n;n-=1}
println("====")
n
//var s1,s0,v1,v0,a1,a0=1.0
//s1 = s0+(v1-v0)+  0.5*(a1-a0)
//不需要分号 {}的值就是最后一个表达式的值
if(n>0){
    r = r*n
    n -=1
}


val digits = List(4,2)

//右边结合操作符
9::List(4,2)

//NIL表示空列表
9::4::2::Nil

9::(4::(2::Nil))

def sum(lst:List[Int]):Int=if(lst==Nil)0 else lst.head+sum(lst.tail)
sum(List(9,4,2))

def sum2(lst:List[Int]):Int= lst match{
    case Nil =>0
    case h:: t=>h +sum(t)
}
sum2(List(9,4,2))

List(9,4,2).sum
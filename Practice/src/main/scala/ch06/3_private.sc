class Counter{
    private var value =0
    def increment(){value+=1}
    def isLess(other:Counter)=value < other.value
}
class Counter2{
    private[this] var value =0
    def increment(){value+=1}
//    def isLess(other:Counter)=value < other.value
}
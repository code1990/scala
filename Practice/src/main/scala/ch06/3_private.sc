/*7.3 对象私有字段
private[this]定义对象私有的字段，不生成 get、set 方法。
*/
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
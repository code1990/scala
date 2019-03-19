/*5.12 匹配嵌套结构
样例类经常被用于嵌套结构。例如，某个商店售卖的物品，有时，会将
多个物品一起打着出售，我们有以下抽象：
*/
abstract class Item

case class Article(description: String, price: Double) extends Item

case class Bundle(description: String, discount: Double, items: Item*) extends Item


val special = Bundle("Father's day special", 20.0,
    Article("Scala for the", 39.95),
    Bundle("Anchor Distillery Sampler", 10.0,
        Article("Old Potrero Straight Rye Whiskey", 79.95),
        Article("Junípero Gin", 32.95)))

special match {
    case Bundle(_, _, Article(descr, _), _*) => descr
}

special match {
    case Bundle(_, _, art @ Article(_, _), rest @ _*) => (art, rest)
}

special match {
    case Bundle(_, _, art @ Article(_, _), rest) => (art, rest)
}
//计算物品价格
def price(it:Item):Double = it match {
    case Article(_,p)=>p
    case Bundle(_, disc, its @ _*) => its.map(price _).sum - disc
}
price(special)


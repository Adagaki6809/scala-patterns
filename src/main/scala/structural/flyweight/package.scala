package structural

package object flyweight {
  def flyweightDemo(): Unit = {
    println("Шаблон Приспособленец:")
    val teaMaker = new TeaMaker()
    val shop = new TeaShop(teaMaker)

    shop.takeOrder("меньше сахара", 1)
    shop.takeOrder("больше молока", 2)
    shop.takeOrder("без сахара", 5)
    shop.serve()

    println()
  }
}

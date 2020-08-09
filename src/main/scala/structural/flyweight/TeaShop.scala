package structural.flyweight

class TeaShop(teaMaker: TeaMaker) {
  protected var orders: List[(Int, KarakTea)] = Nil
  def takeOrder(teaType: String, table: Int): Unit = {
    this.orders = (table,this.teaMaker.make(teaType)) :: this.orders
  }

  def serve(): Unit = {
    this.orders = this.orders.reverse
    this.orders.foreach(tea => println("Подаем " + tea._2.tea + " с опцией '" + tea._2.preference + "' на " + tea._1 + " стол."))
  }
}

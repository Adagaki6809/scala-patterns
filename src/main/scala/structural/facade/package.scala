package structural

package object facade {
  def facadeDemo(): Unit = {
    println("Шаблон Фасад:")
    val computer = new ComputerFacade(new Computer)

    println("Включение:")
    computer.turnOn()
    println("Выключение:")
    computer.turnOff()

    println()
  }
}

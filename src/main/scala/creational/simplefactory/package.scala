package creational

package object simplefactory {
  def launchDemo(): Unit = {
    println("Шаблон Простая фабрика:")
    val door = new DoorFactory().makeDoor(1.2, 2.5)
    println(door.width)
    println(door.height + "\n")
  }
}

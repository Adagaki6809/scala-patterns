package creational

package object abstractfactory {
  def launchDemo(): Unit = {
    val woodenFactory = new WoodenDoorFactory

    var door = woodenFactory.makeDoor
    var expert = woodenFactory.makeFittingExpert

    println("Шаблон Абстрактная фабрика:")

    door.printDescription()
    expert.printDescription()

    val ironFactory = new IronDoorFactory

    door = ironFactory.makeDoor
    expert = ironFactory.makeFittingExpert

    door.printDescription()
    expert.printDescription()

    println
  }
}

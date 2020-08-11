package behavioral

package object visitor {
  def visitorDemo(): Unit = {
    println("Шаблон Посетитель:")
    val monkey = new Monkey()
    val lion = new Lion()
    val dolphin = new Dolphin()

    val speak = new Speak()
    val jump = new Jump()
    monkey.accept(speak)
    monkey.accept(jump)
    lion.accept(speak)
    lion.accept(jump)
    dolphin.accept(speak)
    dolphin.accept(jump)

    println()
  }
}

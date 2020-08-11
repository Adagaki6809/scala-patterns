package behavioral.visitor

class Monkey extends Animal {
  def shout(): Unit = {
    println("У-у-а-а!")
}

  def accept(operation: AnimalOperation): Unit = {
    operation.visitMonkey(this)
  }
}

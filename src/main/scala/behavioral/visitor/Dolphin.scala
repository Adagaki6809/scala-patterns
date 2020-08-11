package behavioral.visitor

class Dolphin extends Animal {
  def speak(): Unit = {
    println("* звуки дельфина *!")
  }

  def accept(operation: AnimalOperation): Unit = {
    operation.visitDolphin(this)
  }
}

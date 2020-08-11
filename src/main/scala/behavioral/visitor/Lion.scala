package behavioral.visitor

class Lion extends Animal {
  def roar(): Unit = {
    println("рррр!")
  }

  def accept(operation: AnimalOperation): Unit = {
    operation.visitLion(this)
  }
}

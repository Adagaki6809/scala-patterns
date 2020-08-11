package behavioral.visitor

trait Animal {
  def accept(operation: AnimalOperation): Unit
}

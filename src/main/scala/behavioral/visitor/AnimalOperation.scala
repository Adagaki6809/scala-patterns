package behavioral.visitor

trait AnimalOperation {
  def visitMonkey(monkey: Monkey): Unit
  def visitLion(lion: Lion): Unit
  def visitDolphin(dolphin: Dolphin): Unit
}

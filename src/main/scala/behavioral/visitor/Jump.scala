package behavioral.visitor

class Jump extends AnimalOperation {
  def visitMonkey(monkey: Monkey): Unit = {
    println("Прыгает на 20 футов!")
  }

  def visitLion(lion: Lion): Unit = {
    println("Прыгает на 7 футов!")
  }

  def visitDolphin(dolphin: Dolphin): Unit = {
    println("Появился над водой и исчез!")
  }
}


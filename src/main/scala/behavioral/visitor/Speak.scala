package behavioral.visitor


class Speak extends AnimalOperation {
  def visitMonkey(monkey: Monkey): Unit = {
    monkey.shout()
  }

  def visitLion(lion: Lion): Unit = {
    lion.roar()
  }

  def visitDolphin(dolphin: Dolphin): Unit = {
    dolphin.speak()
  }
}


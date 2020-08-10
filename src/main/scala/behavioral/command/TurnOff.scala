package behavioral.command

class TurnOff(bulb: Bulb) extends Command {
  override def execute(): Unit = this.bulb.turnOff()
  override def undo(): Unit = this.bulb.turnOn()
  override def redo(): Unit = this.execute()
}


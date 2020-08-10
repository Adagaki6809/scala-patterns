package behavioral.command

class TurnOn(bulb: Bulb) extends Command {
  override def execute(): Unit = this.bulb.turnOn()
  override def undo(): Unit = this.bulb.turnOff()
  override def redo(): Unit = this.execute()
}

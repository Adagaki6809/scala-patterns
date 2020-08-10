package behavioral

package object command {
  def commandDemo(): Unit = {
    println("Шаблон Команда:")
    val bulb = new Bulb
    val turnOn = new TurnOn(bulb)
    val turnOff = new TurnOff(bulb)
    val remote = new RemoteControl
    remote.submit(turnOn)
    remote.submit(turnOff)
    println()
  }
}

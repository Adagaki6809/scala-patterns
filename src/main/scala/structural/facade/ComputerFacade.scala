package structural.facade

class ComputerFacade(computer: Computer) {
  def turnOn(): Unit = {
    computer.electricShock()
    computer.makeSound()
    computer.showLoadingScreen()
    computer.bam()
  }

  def turnOff(): Unit = {
    computer.closeEverything()
    computer.pullCurrent()
    computer.sooth()
  }
}

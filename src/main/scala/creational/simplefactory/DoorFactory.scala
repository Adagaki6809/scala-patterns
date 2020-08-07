package creational.simplefactory

class DoorFactory {
  def makeDoor(width: Double, height: Double): Door = {
    new WoodenDoor(width, height)
  }
}
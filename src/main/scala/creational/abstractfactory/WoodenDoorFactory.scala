package creational.abstractfactory

class WoodenDoorFactory extends DoorFactory {
  override def makeDoor: Door = new WoodenDoor
  override def makeFittingExpert: DoorFittingExpert = new Carpenter
}

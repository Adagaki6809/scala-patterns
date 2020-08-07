package creational.abstractfactory

class IronDoorFactory extends DoorFactory {
  override def makeDoor: Door = new IronDoor
  override def makeFittingExpert: DoorFittingExpert = new Welder
}

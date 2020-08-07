package creational.abstractfactory

trait DoorFactory {
  def makeDoor: Door
  def makeFittingExpert: DoorFittingExpert
}

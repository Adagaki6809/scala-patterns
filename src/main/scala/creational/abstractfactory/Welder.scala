package creational.abstractfactory

class Welder extends DoorFittingExpert {
  override def printDescription(): Unit = println("Я работаю только с железными дверьми.")
}

package creational.abstractfactory

class Carpenter extends DoorFittingExpert {
  override def printDescription(): Unit = println("Я работаю только с деревянными дверьми.")

}

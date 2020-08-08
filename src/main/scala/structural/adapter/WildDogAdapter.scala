package structural.adapter

class WildDogAdapter(dog: WildDog) extends Lion {
  override def roar: String = {
    this.dog.bark
  }
}

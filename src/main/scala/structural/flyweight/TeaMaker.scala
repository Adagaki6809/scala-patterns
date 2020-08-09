package structural.flyweight

class TeaMaker {
  protected var availableTea: Map[String, KarakTea] = Map[String, KarakTea]()
  def make(preference: String): KarakTea = {
    if (!this.availableTea.isDefinedAt(preference)) {
      this.availableTea += (preference -> new KarakTea(preference))
    }
    this.availableTea(preference)
  }
}

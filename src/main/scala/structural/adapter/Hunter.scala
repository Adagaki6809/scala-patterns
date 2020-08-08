package structural.adapter

class Hunter {
  def hunt(lion: Lion): Unit = {
    println("Охотник охотится и попадает в животное: " + lion.roar)
  }
}

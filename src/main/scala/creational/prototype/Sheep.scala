package creational.prototype
import scala.collection.mutable.ArrayBuffer

class Sheep extends Cloneable {
  private var _name: String = ""
  private var _category: String = ""
  var elementsAffected: ArrayBuffer[Int] = ArrayBuffer[Int]()
  def this(_name: String, _category: String = "Горная овечка", elementsAffected: ArrayBuffer[Int]) = {
    this
    this._name = _name
    this._category = _category
    this.elementsAffected = elementsAffected
  }

  def this(copySheep: Sheep) = {
    this(copySheep._name, copySheep._category, copySheep.elementsAffected.clone())
  }

  def myClone: Sheep = {
    println("\nКопирование с помощью метода clone из Cloneable:")
    val newSheep: Sheep = this.clone.asInstanceOf[Sheep]
    newSheep.elementsAffected = this.elementsAffected.clone()
    newSheep
  }

  def name: String = _name
  def name_= (name: String): Unit = {_name = name}
  def category: String = _category
  def category_= (category: String): Unit = {_category = category}
}

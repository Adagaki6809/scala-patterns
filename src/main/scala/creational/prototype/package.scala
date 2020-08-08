package creational
import scala.collection.mutable.ArrayBuffer

package object prototype {
  def prototypeDemo(): Unit = {
    println("Шаблон Прототип:")
    val list: ArrayBuffer[Int] = ArrayBuffer[Int](1, 2)
    var original: Sheep = new Sheep(_name="Джолли", elementsAffected=list)
    var cloned: Sheep = new Sheep(original)
    cloned.name = "Долли"
    cloned.elementsAffected += 333
    println("Копирование через конструктор:")
    println("Имя: " + original.name  + "\tКатегория: " + original.category)
    print("Список: ")
    original.elementsAffected.foreach(x => print(x + " "))
    println()
    println("Имя: " + cloned.name  + "\tКатегория: " + cloned.category)
    print("Список: ")
    cloned.elementsAffected.foreach(x => print(x + " "))
    println()

    var original2: Sheep = new Sheep(_name="Марита", elementsAffected=list)
    var cloned2: Sheep = original2.myClone
    cloned2.name = "Марта"
    cloned2.elementsAffected += 333
    println("Имя: " + original2.name  + "\tКатегория: " + original2.category)
    print("Список: ")
    original2.elementsAffected.foreach(x => print(x + " "))
    println()
    println("Имя: " + cloned2.name  + "\tКатегория: " + cloned2.category)
    print("Список: ")
    cloned2.elementsAffected.foreach(x => print(x + " "))
    println("\n")
  }
}

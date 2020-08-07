package creational

package object singleton {
  def launchDemo(): Unit = {
    println("Шаблон Одиночка:")
    President.instance.doSomething
    President.instance.doSomething
    President.instance.doSomething
    assert(President.instance == President.instance)
    println
  }
}

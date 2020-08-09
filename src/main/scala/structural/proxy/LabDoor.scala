package structural.proxy

class LabDoor extends Door {
  def open(): Unit = println("Открытие двери лаборатории.")
  def close(): Unit = println("Закрытие двери лаборатории.")
}

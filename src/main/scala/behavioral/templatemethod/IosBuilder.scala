package behavioral.templatemethod


class IosBuilder extends Builder {
  def test(): Unit = println("Запуск iOS тестов.")
  def lint(): Unit = println("Копирование iOS кода.")
  def assemble(): Unit = println("iOS сборка.")
  def deploy(): Unit = println("Развертывание сборки на сервере.")
}


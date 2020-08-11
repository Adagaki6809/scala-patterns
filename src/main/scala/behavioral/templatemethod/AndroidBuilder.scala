package behavioral.templatemethod

class AndroidBuilder extends Builder {
  def test(): Unit = println("Запуск Android тестов.")
  def lint(): Unit = println("Копирование Android кода.")
  def assemble(): Unit = println("Android сборка.")
  def deploy(): Unit = println("Развертывание сборки на сервере.")
}

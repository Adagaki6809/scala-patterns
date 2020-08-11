package behavioral

package object state {
  def stateDemo(): Unit = {
    println("Шаблон Состояние:")
    val editor = new TextEditor(new Default())

    editor.typeDoc("Первая строка")

    editor.state = new UpperCase()

    editor.typeDoc("Вторая строка")
    editor.typeDoc("Третья строка")

    editor.state = new LowerCase()

    editor.typeDoc("Четвертая строка")
    editor.typeDoc("Пятая строка")

    println()
  }
}

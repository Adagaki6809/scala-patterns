package behavioral

package object memento {
  def mementoDemo(): Unit = {
    println("Шаблон Хранитель:")
    val editor = new Editor
    editor.typeDoc("Это первое предложение.")
    editor.typeDoc(" Это второе.")
    val saved = editor.save
    editor.typeDoc(" И это третье.")
    println(editor.content)
    editor.restore(saved)
    println(editor.content)
    println()
  }
}

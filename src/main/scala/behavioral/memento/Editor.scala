package behavioral.memento

class Editor {
  private var _content: String = ""
  def content: String = _content
  def content_= (newContent: String): Unit = {
    _content = newContent
  }
  def typeDoc(words: String): Unit = {
    content = content + words
  }
  def save: EditorMemento = {
    new EditorMemento(content)
  }
  def restore(memento: EditorMemento): Unit = {
    content = memento.content
  }
}

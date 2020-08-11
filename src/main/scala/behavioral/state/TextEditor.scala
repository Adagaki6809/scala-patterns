package behavioral.state

class TextEditor(var _state: WritingState) {
  def state: WritingState = _state

  def state_=(newState: WritingState): Unit = {
    _state = newState
  }

  def typeDoc(words: String): Unit = {
    state.write(words)
  }
}

package behavioral.state

class Default extends WritingState {
  def write(words :String): Unit = {
    println(words)
  }
}

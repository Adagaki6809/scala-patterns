package behavioral.iterator

trait CustomIterator[T] {
  def hasNext: Boolean
  def next: T
}

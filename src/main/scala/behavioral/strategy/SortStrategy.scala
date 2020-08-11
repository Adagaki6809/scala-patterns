package behavioral.strategy

trait SortStrategy {
  def sort[T](dataset: Array[T]): Array[T]
}

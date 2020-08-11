package behavioral.strategy

class QuickSortStrategy extends SortStrategy {
  def sort[T](dataset: Array[T]): Array[T] = {
    println("Быстрая сортировка.")
    dataset
  }
}

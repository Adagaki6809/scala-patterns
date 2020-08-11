package behavioral.strategy

class BubbleSortStrategy extends SortStrategy {
  def sort[T](dataset: Array[T]): Array[T] = {
    println("Сортировка пузырьком.")
    dataset
  }
}

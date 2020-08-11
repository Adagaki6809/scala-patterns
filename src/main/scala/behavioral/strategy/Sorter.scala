package behavioral.strategy

class Sorter(sortStrategy: SortStrategy) {
  def sort[T](dataset: Array[T]): Array[T] = {
    sortStrategy.sort(dataset)
  }
}

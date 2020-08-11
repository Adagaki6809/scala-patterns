package behavioral

package object strategy {
  def strategyDemo(): Unit = {
    println("Шаблон Стратегия:")
    val dataset = Array(1, 5, 4, 3, 2, 8)

    var sorter = new Sorter(new BubbleSortStrategy())
    sorter.sort(dataset) // Вывод : Сортировка пузырьком

    sorter = new Sorter(new QuickSortStrategy())
    sorter.sort(dataset) // Вывод : Быстрая сортировка

    println()
  }
}

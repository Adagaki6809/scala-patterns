package behavioral

package object observer {
  def observerDemo(): Unit = {
    println("Шаблон Наблюдатель:")
    // Создаем соискателей
    val johnDoe = new JobSeeker("John Doe")
    val janeDoe = new JobSeeker("Jane Doe")

    // Создаем публикацию и добавляем подписчика
    val jobPostings = new JobPostings
    jobPostings.attach(johnDoe)
    jobPostings.attach(janeDoe)

    // Добавляем новую работу и смотрим получит ли соискатель уведомление
    jobPostings.addJob(new JobPost("Software Engineer"))

    println()
  }
}

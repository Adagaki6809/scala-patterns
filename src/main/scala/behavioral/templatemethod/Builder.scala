package behavioral.templatemethod

abstract class Builder {
  final def build(): Unit = {
    this.test()
    this.lint()
    this.assemble()
    this.deploy()
  }

  def test(): Unit
  def lint(): Unit
  def assemble(): Unit
  def deploy(): Unit
}

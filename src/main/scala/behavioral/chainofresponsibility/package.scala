package behavioral

package object chainofresponsibility {
  def chainofresponsibilityDemo(): Unit = {
    println("Шаблон Цепочка обязанностей:")
    val bank = new Bank(100.0)
    val paypal = new PayPal(200.0)
    val bitcoin = new BitCoin(300.0)

    bank.setNext(paypal)
    paypal.setNext(bitcoin)
    bank.pay(259.0)
    println()
  }
}

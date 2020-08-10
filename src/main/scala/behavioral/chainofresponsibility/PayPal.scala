package behavioral.chainofresponsibility

class PayPal(balance: Double) extends Account {
  protected var _balance: Double = balance
}

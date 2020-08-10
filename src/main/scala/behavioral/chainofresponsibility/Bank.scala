package behavioral.chainofresponsibility

class Bank(balance: Double) extends Account {
  protected var _balance: Double = balance
}

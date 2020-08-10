package behavioral.chainofresponsibility

abstract class Account {
  protected var successor: Account = _
  protected var _balance: Double
  def setNext(account: Account): Unit = {
    this.successor = account
  }
  def pay(amountToPay: Double): Unit = {
    if (this.canPay(amountToPay)) {
      println(s"Оплата $amountToPay, используя ${this.getClass}")
    }
    else {
      if (this.successor != null) {
          println(s"Нельзя заплатить, используя ${this.getClass}. Обработка...")
          this.successor.pay(amountToPay)
        }
        else
        {
          throw new Exception("Ни на одном из аккаунтов нет необходимого количества денег.")
        }
      }
    }

  def canPay(amount: Double): Boolean = {
    this._balance >= amount
  }
}

object AbstractDemo {
  def main(args: Array[String]): Unit = {

  }

}

class Account (inAccountNo:Long,inBalanceNo:Long,inPasswd:String) {
  /**
   * 账号余额密码 查询 取款存款
   */

  var accountNo: Long = 0
  var balance: Long = 0
  var passwd: String = ""


  def query(accountNo: Long, passwd: String): Long = {
    this.balance
  }

  def get(accountNo: Long, passwd: String, money: Long): Long = {
    if (!accountNo.equals(this.accountNo) || !passwd.equals(this.passwd)) {
      throw new RuntimeException(" accoutnNo or passwd illegle")
    }

    if (balance > money) {
      money
    } else {
      throw new RuntimeException(" no more balance")
    }
  }

  def set(accountNo: Long, passwd: String, money: Long): Long = {
    if (!accountNo.equals(this.accountNo) || !passwd.equals(this.passwd)) {
      -1
      throw new RuntimeException(" accoutnNo or passwd illegle")
    }
    balance += money
    balance
  }
}

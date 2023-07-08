object second_question {
  def main(args: Array[String]): Unit = {
    var n:Int = 10
    primeSeq(n-1)
  }

  def gcd(a: Int, b: Int): Int = b match {
    case 0 => a
    case x if x > a => gcd(x, a)
    case x => gcd(x, a % x)
  }

  def prime(n: Int, v: Int = 2): Boolean = v match {
    case x if (x == n) => true
    case x if gcd(n, x) > 1 => false
    case x => prime(n, x + 1)
  }

  def primeSeq(n: Int): Unit = {
    if (n < 2) {
      return 0
    } else {
      primeSeq(n - 1)
      if (prime(n)) {
        println(n)
      }
    }

  }
}

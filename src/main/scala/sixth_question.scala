object sixth_question {
  def main(args: Array[String]): Unit = {
      fibonacciSeq(10)
  }

  def fibonacci(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case x if x>1 => fibonacci(x - 1) + fibonacci(x - 2)
  }

  def fibonacciSeq(n: Int): Unit = {
    if (n > 0)
      fibonacciSeq(n - 1)

    println(fibonacci(n))
  }

}

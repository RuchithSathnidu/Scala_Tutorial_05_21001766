object fifth_question {
  def main(args: Array[String]): Unit = {
         var n:Int = 12
         println(even_sum(n-1))
  }

  def isEven(n: Int): Boolean = {
    var p: Int = 0
    if (n < 0) {
      p = (-1 * n)
    } else {
      p = n
    }

    p match {
      case 0 => true
      case _ => isOdd(p - 1)
    }
  }

  def isOdd(n: Int): Boolean = !(isEven(n))

  def even_sum(n:Int):Int = {
      if(n<=0)
         return 0
      if(isEven(n))
        n + even_sum(n-1)
      else
        even_sum(n-1)
  }
}



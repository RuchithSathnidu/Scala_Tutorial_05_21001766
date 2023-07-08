object fourth_question {
  def main(args: Array[String]): Unit = {
       println(isEven(6))
       println(isOdd(6))
       println(isEven(5))
       println(isOdd(5))
  }

  def isEven(n: Int): Boolean = {
    var p : Int = 0
    if(n<0) {
        p = (-1*n)
    }else{p = n}

    p match {
    case 0 => true
    case _ => isOdd(p - 1)
  }
  }

  def isOdd(n: Int): Boolean = !(isEven(n))

}

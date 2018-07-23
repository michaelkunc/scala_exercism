object DifferenceOfSquares {

  def sumOfSquares(n: Int): Int = (1 to n).map(sqr).sum

  def squareOfSum(n: Int): Int = sqr((1 to n).sum) 

  def differenceOfSquares(n: Int): Int = squareOfSum(n) - sumOfSquares(n)

  private def sqr(n: Int): Int = n * n
}

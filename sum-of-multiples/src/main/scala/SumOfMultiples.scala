object SumOfMultiples {
  def sumOfMultiples(factors: Set[Int], limit: Int): Int = 
  (1 until limit)
  	.filter(x => factors
  		.exists(i => x % i == 0))
  			.sum
}


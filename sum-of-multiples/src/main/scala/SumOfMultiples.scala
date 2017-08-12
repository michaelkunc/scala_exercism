object SumOfMultiples {
  def sumOfMultiples(factors: Set[Int], limit: Int): Int = 
	  if (limit < factors.head){
	  	0
	  } else {
	  	val l = factors.toSeq
	  	var sum = 0
	  	for( i <- l(0) to limit if i % l(0) == 0 || i % l(1) == 0) sum += i
	  	sum
		  	}
  
}


object SumOfMultiples {
  def sumOfMultiples(factors: Set[Int], limit: Int): Int = 
	  if (factors.isEmpty || limit < factors.head){
	  	0
	  } else {
	  	val l = factors.toSeq
	  	var sum = 0
	  	if (l.size == 2) { 
		  	for( i <- l(0) until limit if i % l(0) == 0 || i % l(1) == 0) sum += i
		  	sum
	    } else {
	    	for( i <- l(0) until limit if i % l(0) == 0 || i % l(1) == 0 || i % l(2) == 0) sum += i
		  	sum
	    }
	  }  
}


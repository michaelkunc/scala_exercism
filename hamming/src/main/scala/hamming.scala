object Hamming {

  def compute(strand1: String, strand2 : String): Int ={
    require(strand1.length == strand2.length, "Strands must be the same length")
    (strand1.zip(strand2).count(x => x._1 != x._2))
  }
}
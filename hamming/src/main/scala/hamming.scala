object Hamming {

  def compute(strand1: String, strand2 : String): Int ={
    if (strand1.length != strand2.length) {
      throw new IllegalArgumentException("Strands must be the same length")
    } else {
      (strand1.zip(strand2).count(x => x._1 != x._2))
    }
  }
}
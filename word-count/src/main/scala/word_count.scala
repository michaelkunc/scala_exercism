import collection.mutable

class Phrase(phrase : String){

  def wordCount(): mutable.Map[String, Int] = {
    val counts = mutable.Map.empty[String, Int].withDefaultValue(0)
    for (words <- this.phrase.split("[^\\w']+")){
      val word = words.toLowerCase
      counts(word) += 1
    }
    counts
  }
}
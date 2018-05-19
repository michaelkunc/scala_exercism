
class Phrase(phrase : String){

  def wordCount(): Map[String, Int] = {
    phrase
      .toLowerCase
      .split("[^\\w']+")
      .groupBy(identity)
      .mapValues(_.size)
    }
}
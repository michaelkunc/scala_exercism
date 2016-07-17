import scala.util.matching.Regex

class Bob(){

  def hey(statement : String): String = statement match {
    case Shouting() => "Whoa, chill out!"
    case Silence() => "Fine. Be that way!"
    case Question() => "Sure."
    case _ => "Whatever."
  }
}

case object Silence {
  def unapply(statement: String) =
    statement.trim.length == 0
}

case object Shouting {
  val pattern = new Regex("[a-zA-z]")
  def unapply(statement: String) =
    statement == statement.toUpperCase && pattern.findAllMatchIn(statement).length != 0
}

case object Question {
  def unapply(statement: String) =
    statement.takeRight(1) == "?"
}

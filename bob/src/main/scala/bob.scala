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
    statement.trim.isEmpty
}

case object Shouting {
  def unapply(statement: String) = {
    (statement.exists(_.isLetter)) && (statement.forall(!_.isLower))
  }
}

case object Question {
  def unapply(statement: String) =
    statement.endsWith("?")
}

import scala.util.matching.Regex

class Bob(){

  def hey(statement : String): String = {
    if (shouting(statement)){
      "Whoa, chill out!"
    } else if (question(statement)){
      "Sure."
    } else if (silence(statement)){
      "Fine. Be that way!"
    }  else {
      "Whatever."
    }
  }

  def silence(statement: String): Boolean = {
    statement.trim.length == 0
  }

  def shouting(statement: String): Boolean = {
    statement == statement.toUpperCase && containsLetters(statement)
  }

  def question(statement: String): Boolean = {
    statement.takeRight(1) == "?"
  }

  def containsLetters(statement: String): Boolean= {
    val pattern = new Regex("[a-zA-z]")
    pattern.findAllMatchIn(statement).length > 0
  }

}

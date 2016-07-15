class Bob(){

  def hey(statement : String): String = {
    if (shouting(statement)){
      "Whoa, chill out!"
    } else {
      "Whatever."
    }
  }

  def shouting(statement: String): Boolean = {
    statement.takeRight(1) == "!"
  }
}

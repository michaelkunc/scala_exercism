class School {
  type DB = Map[Int, Seq[String]]

  def add(name: String, g: Int) = ???

  def db: DB = Map[Int, Seq[String]]()

  def grade(g: Int): Seq[String] = ???

  def sorted: DB = ???
}

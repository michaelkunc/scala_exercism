class School {
  type DB = Map[Int, Seq[String]]

  private var _db = Map[Int, Seq[String]]()

  def add(name: String, g: Int) = {
    _db = _db + (g -> (grade(g) :+ name))
  } 

  def db: DB = _db

  def grade(g: Int): Seq[String] = db getOrElse(g, Nil)

  def sorted: DB = _db.toSeq.sortBy(_._1).toMap.transform((k, v)=> v.sorted)
}

object Etl{
    def transform(letters: Map[Int, Seq[String]]): Map[String, Int] = {
        letters.flatMap( 
            {case (key, values) => values.map(_.toLowerCase() -> key)}
        )
    }
}
class Robot {

    var set = scala.collection.mutable.Set[String]()

    var name: String = name_builder()

    def reset() = this.name = name_builder()
    

    def name_builder(): String = {
        val r = scala.util.Random
        val prefix = r.shuffle(('A' to 'Z').toList).take(2).mkString
        val suffix = r.shuffle((0 to 9).toList).take(3).mkString
        val name = prefix + suffix
        if (set.contains(name)) {
            name_builder()
        } else {
            set += name
            name
        }

    }
}
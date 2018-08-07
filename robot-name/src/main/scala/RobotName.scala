class Robot {

    var name: String = name_builder()

    def reset(): String = {
        this.name = name_builder()
        this.name
    }

    def name_builder(): String = {
        val r = scala.util.Random
        val prefix = r.shuffle(('A' to 'Z').toList).take(2).mkString
        val suffix = r.shuffle((0 to 9).toList).take(3).mkString
        prefix + suffix
    }
    // need to
    // 1) build the name
    // 2) store it someplace
    // 3) make sure names don't clash

}
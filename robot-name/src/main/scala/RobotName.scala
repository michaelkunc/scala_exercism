class Robot {

    var name = name_builder()

    def reset() = name_builder()

    def name_builder() = {
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
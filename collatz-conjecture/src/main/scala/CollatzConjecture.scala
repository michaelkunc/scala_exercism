object CollatzConjecture{
    def steps(num: Int, stepCount: Int = 0): Option[Int] = num match {
        case x if x < 1 => None
        case 1 => Some(stepCount)
        case x if x  % 2 == 0 => (steps(num / 2, stepCount+1))
        case _ => (steps((num * 3) + 1, stepCount+1))

    }
}
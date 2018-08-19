object CollatzConjecture{
    def steps(num: Int, stepCount: Int = 0): Option[Int] = num match {
        case 1 => Some(stepCount)
        case _ if num % 2 == 0 => (steps(num / 2, stepCount+1))

    }
}
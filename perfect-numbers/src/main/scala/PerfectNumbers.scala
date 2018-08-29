object PerfectNumbers{
    def classify(num: Int) = aliquot_sum(num) match {
        case s if s == num => Right(NumberType.Perfect)
    }

    private def aliquot_sum(n: Int) = {
        1.until(n).filter(n % _ == 0).sum
    }
}

object NumberType extends Enumeration {
    val Perfect, Abundant, Deficient = Value
}
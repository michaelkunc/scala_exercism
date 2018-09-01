object PerfectNumbers{
    def classify(num: Int) = aliquot_sum(num) match {
        case z if z < 1 => Left("Classification is only possible for natural numbers.")
        case p if p == num => Right(NumberType.Perfect)
        case a if a > num => Right(NumberType.Abundant)
        case d if d < num => Right(NumberType.Deficient)
        case o if num == 1 => Right(NumberType.Deficient)
    }

    private def aliquot_sum(n: Int) = {
        1.until(n).filter(n % _ == 0).sum
    }
}

object NumberType extends Enumeration {
    val Perfect, Abundant, Deficient = Value
} 
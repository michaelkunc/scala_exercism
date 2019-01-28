import NumberType.NumberType

object PerfectNumbers{
    def classify(num: Int): NumberType = {
        (num, aliquot_sum(num)) match {
            case (x, y) if (x == y) => NumberType.Perfect
            case (x, y) if (x < y) => NumberType.Abundant
            case (x, y) if (x > y) => NumberType.Deficient
        }
    }

    private def aliquot_sum(n: Int) = {
        1.until(n).filter(n % _ == 0).sum
    }
}

object NumberType extends Enumeration {
    type NumberType = Value
    val Perfect, Abundant, Deficient = Value
} 



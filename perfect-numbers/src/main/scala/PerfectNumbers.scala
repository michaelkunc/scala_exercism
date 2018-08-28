object PerfectNumbers{
    def classify(num: Int) = {
        Right(NumberType.Perfect)
    }
}

object NumberType extends Enumeration {
    val Perfect, Abundant, Deficient = Value
}
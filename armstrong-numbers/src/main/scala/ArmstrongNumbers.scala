object ArmstrongNumbers{
    def isArmstrongNumber(num: Int): Boolean = {
        val digits = num.toString
        digits.map(x => (Math.pow(x.asDigit, digits.length))).sum == num
    }
}
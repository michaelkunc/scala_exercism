
import scala.math.BigDecimal.RoundingMode

class SpaceAge(age: Long) {
  private val earthYear = 31557600

  def seconds: Long = age

  val getAge = roundAge(earthYear) _

  def onEarth: Double = getAge(1)

  def onMercury: Double = getAge(0.2408467)

  def onVenus: Double = getAge(0.61519726)

  def onMars: Double = getAge(1.8808158)

  def onJupiter: Double = getAge(11.862615)

  def onSaturn: Double = getAge(29.447498)

  def onUranus: Double = getAge(84.016846)

  def onNeptune: Double = getAge( 164.79132)

  private def roundAge(ratio: Double)(f: Double) = (BigDecimal.decimal(age / ratio).setScale(2, RoundingMode.HALF_UP).toDouble) * (f)
}

object SpaceAge {
  def apply(ageInSeconds: Long) = new SpaceAge(ageInSeconds)
}
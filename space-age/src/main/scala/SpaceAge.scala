object SpaceAge {

  private def getAge(orbitalPeriod: Double) (age: Double)  : Double = {
    val earthSeconds = 31557600
    val thisAge = (age / (orbitalPeriod*earthSeconds))
    Math.round(thisAge * 100.0) / 100.0
    
  }

  val planets = Map(
    "Earth" -> 1.0,
    "Mercury" -> 0.2408467,
    "Venus" -> 0.61519726,
    "Mars" -> 1.8808158,
    "Jupiter" -> 11.862615,
    "Saturn" -> 29.447498,
    "Uranus" -> 84.016846,
    "Neptune" -> 164.79132
  )
  

  def onEarth(age: Double): Double = getAge(planets("Earth")) (age)
  def onMercury(age: Double): Double = getAge(planets("Mercury")) (age)
  def onVenus(age: Double): Double = getAge(planets("Venus")) (age)
  def onMars(age: Double): Double = getAge(planets("Mars")) (age)
  def onJupiter(age: Double): Double = getAge(planets("Jupiter")) (age)
  def onSaturn(age: Double): Double = getAge(planets("Saturn")) (age)
  def onUranus(age: Double): Double = getAge(planets("Uranus")) (age)
  def onNeptune(age: Double): Double = getAge(planets("Neptune")) (age)
}
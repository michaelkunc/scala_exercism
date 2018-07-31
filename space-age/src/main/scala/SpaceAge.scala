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
  

  val onEarth = getAge(planets("Earth")) (age)

}
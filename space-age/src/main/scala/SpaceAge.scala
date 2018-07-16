object SpaceAge {

  private def getAge(age: Double, orbitalPeriod: Double)  : Double = {
    val earthSeconds = 31557600
    val thisAge = (age / (orbitalPeriod*earthSeconds))
    Math.round(thisAge * 100.0) / 100.0
    
  }
  

  def onEarth(age: Double): Double = getAge(age, 1)
  def onMercury(age: Double): Double = getAge(age, 0.2408467)
  def onVenus(age: Double): Double = getAge(age, 0.61519726) 
  def onMars(age: Double): Double = getAge(age, 1.8808158)
  def onJupiter(age: Double): Double = getAge(age, 11.862615)
  def onSaturn(age: Double): Double = getAge(age, 29.447498)
  def onUranus(age: Double): Double = getAge(age, 84.016846)
  def onNeptune(age: Double): Double = getAge(age, 164.79132)
}
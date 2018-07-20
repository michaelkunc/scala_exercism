import java.time.LocalDate
import java.time.LocalDateTime
import scala.math.pow

object Gigasecond {

  val gigasecond = scala.math.pow(10, 9).toLong

  def add(startDate: LocalDate): LocalDateTime = add(startDate.atTime(0,0 ))

  def add(startDateTime: LocalDateTime): LocalDateTime = startDateTime.plusSeconds(gigasecond)
}

import util.Random

open class Service(name: String):
  def work(i: Int): (Int, Int) = (i, Random.between(0, 1000))

val service1 = new Service("two")
(1 to 3) foreach (i => println(s"Result: ${service1.work(i)}"))
//Result: (1,497)
//Result: (2,851)
//Result: (3,338)

enum Level:
  case Info, Warn, Error
  def ==(other: Level): Boolean = this.ordinal == other.ordinal
  def >=(other: Level): Boolean = this.ordinal >= other.ordinal

trait Logging:
  import Level.*

  def level: Level
  def log(level: Level, message: String): Unit

  final def info(message: String): Unit =
    if level >= Info then log(Info, message)
  final def warn(message: String): Unit =
    if level >= Warn then log(Warn, message)
  final def error(message: String): Unit =
    if level >= Error then log(Error, message)

trait StdoutLogging extends Logging:
  def log(level: Level, message: String) =
    println(s"${level.toString.toUpperCase}: $message")

case class LoggedService(name: String, level: Level) extends Service(name) with StdoutLogging:
  override def work(i: Int): (Int, Int) =
    info(s"Starting work: i = $i")
    val result = super.work(i)
    info(s"Ending work: result = $result")
    result

val service2 = LoggedService("two", Level.Info)
(1 to 3) foreach (i => println(s"Result: ${service2.work(i)}"))

// INFO: Starting work: i = 1
// INFO: Ending work: result = (1,142)
// Result: (1,142)
// INFO: Starting work: i = 2
// INFO: Ending work: result = (2,823)
// Result: (2,823)
// INFO: Starting work: i = 3
// INFO: Ending work: result = (3,553)
// Result: (3,553)
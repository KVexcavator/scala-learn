import akka.actor.{Actor, ActorSystem, Props}

// Определение актора
class CatActor extends Actor :
  def receive = {
    case "мяу" => println("Котик говорит: Мяу!")
    case "спать" => println("Котик спит.")
    case _ => println("Котик не понимает эту команду.")
  }

// Создание акторной системы
val system = ActorSystem("CatSystem")

// Создание актора
val catActor = system.actorOf(Props(new CatActor), "cat")

// Отправка сообщений актеру
catActor ! "мяу"    // Выведет: Котик говорит: Мяу!
catActor ! "спать"  // Выведет: Котик спит.
catActor ! "играть" // Выведет: Котик не понимает эту команду.

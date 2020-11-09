import Exercises.Animal

object Exercises 
  {
  trait Animal {
    def name: String
  }

  case class Cat(override val name: String) extends Animal

  case class Dog(override val name: String) extends Animal

  case class Shelter[+T <: Animal](animals: List[T]) {
    def +[P >: T <: Animal](new_animal: P): Shelter[P] = {
      Shelter(animals :+ new_animal)
    }

    def ++[P >: T <: Animal](shelter: Shelter[P]): Shelter[P] = {
      Shelter(animals ++ shelter.animals)
    }

    def getNames: List[String] = {
      animals.map(_.name)
    }

    def feed[P >: T <: Animal](food: Food[P]): List[String] = {
      animals.map(food.feed(_))
    }
  }

  trait Food [T <: Animal] {
    val name = ""
    def feed[P <: T](animal: P): String = {
      s"${animal.name} eats ${this.name}"
    }
  }

  case object Meat extends Food[Animal]{
    override val name: String = "meat"
  }

  case object Milk extends Food[Cat]{
    override val name: String = "milk"
  }

  case object Bread extends Food[Dog]{
    override val name: String = "bread"
  }
}
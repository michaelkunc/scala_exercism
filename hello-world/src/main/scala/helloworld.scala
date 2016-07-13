object HelloWorld {
  def hello(name: String = "World") = "Hello, " + name +"!";

  def main(args: Array[String]) :Unit = {
    println(hello())
  }
}

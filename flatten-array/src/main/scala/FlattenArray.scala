object  FlattenArray {
    def flatten(list: List[Any]): List[Int] = {
        list.flatMap(f = element =>
        element match {
            case list: List[Any] => flatten(list) 
            case integer: Int => List(integer)
            case _ => None
        })
    }
}
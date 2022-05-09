fun main(){
    
    // el tipo de dato de la variable puede eliminarse
    // si se puede inferir por el contenido de la lista
    val numbers: List<Int> = listOf(1,2,3,4,5,6)

    println("List: $numbers")
    println("Size: ${numbers.size}")
    // puede usarse la sintaxis abreviada numbers[0]
    println("First element: ${numbers.get(0)}")
    println("Second element: ${numbers[1]}")
    println("Last index: ${numbers.size - 1}")
    println("Last element: ${numbers[numbers.size - 1]}")

    // algunas operaciones con listas
    println("First: ${numbers.first()}")
    println("Last: ${numbers.last()}")

    // contains para saber si un elemento se encuentra en la lista
    println("Contains 4? ${numbers.contains(4)}")
    println("Contains 7? ${numbers.contains(7)}")


    // las listas de solo lectura no se pueden modificar
    // pero si es posible crear operaciones con ellas 
    // con el fin de obtener "nuevas" listas. 
    val colors = listOf("green", "orange", "blue")

    println("Reversed list: ${colors.reversed()}")
    println("List: $colors")

    println("Sorted list: ${colors.sorted()}")

    //
    val oddNumbers = listOf(5, 3, 7, 1)
    println("List: $oddNumbers")
    println("Sorted list: ${oddNumbers.sorted()}")



    // listas mutables
    
    // kotlin intenta inferir el tipo de dato de la lista
    val entrees = mutableListOf<String>()

    // o especificamos el tipo de dato de la variable donde se 
    // almacenara la lista
    val entrees2: MutableList<String> = mutableListOf()

    // NOTA -> utilizamos val ya que la referencia a la lista
    // nunca cambiara, lo que cambiara sera la lista en si.


    // si se imprime una lista vacia de esta manera
    println("Entrees: $entrees")
    // la salida sera tal que Entrees: []


    //Se agregan elementos utilizando el metodo add()
    // esta funcion devuelve un valor booleano para la operación
    println("Add noodles:  ${entrees.add("noodles")}")
    println("Entrees: $entrees")


    println("Add spaghetti: ${entrees.add("spaghetti")}")
    println("Entrees: $entrees")

    // para agregar varios elementos a la vez utilizamos addAll()
    val moreItems = listOf("ravioli", "lasagna", "fettuccine")
    println("Add list: ${entrees.addAll(moreItems)}")
    println("Entrees: $entrees")


    // Remove an item using remove()
    println("Remove spaghetti: ${entrees.remove("spaghetti")}")
    println("Entrees: $entrees")
    println("Remove item that doesn't exist: ${entrees.remove("rice")}")
    println("Entrees: $entrees")

    // Remove an item using removeAt() with an index
    println("Remove first element: ${entrees.removeAt(0)}")
    println("Entrees: $entrees")

    // Clear out the list
    entrees.clear()
    println("Entrees: $entrees")

    // Check if the list is empty
    println("Empty? ${entrees.isEmpty()}")


}

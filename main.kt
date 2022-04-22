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

    

}

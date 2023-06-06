//Listas
fun main() {

    //lista inmutable
    val readOnly : List<String> = listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo");

    println(readOnly);
    println("Tamaño de la lista: ${readOnly.size}");
    println("Elemento en la posición 3: ${readOnly.get(3)} ");
    println("Primer elemento de la lista: ${readOnly.first()}");
    println("Último elemento de la lista: ${readOnly.last()}");
    //Mostrar los elementos de la lista usando estructura for
    println("Elemntos de readOnly:")
    for ( elemento in readOnly ){
        println(elemento);
    }
    //Mostrar elementos de la lista usando el método forEach
    println("Elementos de readOnly usando forEach:");
    readOnly.forEach{
        println(it)
    }

    //Lista mutable
    var mutableList : MutableList<String> = mutableListOf("Lunes", "Martes");
        println("Lista mutable: $mutableList");
        mutableList.add("Miercoles");
        println("Lista mutables: $mutableList");

    //Lista mutable vacía
    var emptyList : MutableList<String> = mutableListOf();
    println("¿La lista esta vacía?: ${emptyList.none()}");
    println("Primer elemento de emptyList: ${emptyList.firstOrNull()}");
    println("Último elemento de emptyList: ${emptyList.lastOrNull()}");
    println("Elemento en la posición 2 de emptyList: ${emptyList.elementAtOrNull(2)}");

    //agregando elementos a emptyList
    readOnly.forEach{
        emptyList.add(it);
    }
    println("La lista que estaba vacía: $emptyList");

    //Mostrar elementos de la lista usando el método forEach
    // println("Elementos de emptyList usando forEach:");
    // emptyList.forEach{
    //     println(it)
    // }

    //Ordenar una lista
    val numerosDeLoteria = listOf(11, 2, 44, 33, 56, 78, 66);
    println("Números de loteria: $numerosDeLoteria");
    val numerosOrdenados = numerosDeLoteria.sorted();
    println("Numeros ordenados: $numerosOrdenados"); 
    val numerosDescendentes = numerosDeLoteria.sortedDescending();
    println("Numeros ordenados en forma descendente: $numerosDescendentes");
    
    //función anonimaa
    val numerosPares = numerosDeLoteria.filter{num -> num % 2 == 0};
    println("Numeros pares: $numerosPares");

}
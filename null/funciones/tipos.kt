//Usando funciones que regresan valores
//y funciones que no regresan valores

fun main() {

    val n1 = 12;
    val n2 = 15;
    borde("=", 20);
    var resultado = suma(n1, n2);
    println(resultado);
    borde("*", 35);

    //Ejemplo 1 de función anónima
    val slogan = {r : Int -> println("Tu puedes con $r problemas y mas") };

    //Invocar función anónima - forma 1
    slogan(resultado);

    val resta = {n1 : Int, n2 : Int -> n1 - n2};
    println("Resta: ${resta(12,18)}");

    //Funcion anonima que encuentre el mayor de tres numeros
    //val max = { n1: Int, n2: Int , n3: Int -> Int};
    //println("Valor máximo: $max(12,14,15)");
    val max = { n1: Int, n2: Int, n3: Int -> maxOf(n1, n2, n3) }
    println("Valor máximo: ${max(12, 13, 20)}")

    //funcion anonima que calcule el promedio de tres numeros
    val promedio = { n1: Int, n2: Int, n3: Int -> (n1 + n2 + n3) / 3 }
    println("Promedio: ${promedio(17, 12, 2)}")



}

fun borde(caracter : String, veces : Int){
    for ( i in 1..veces){
        print(caracter);
    }
    println();
}

fun suma(n1:Int, n2:Int):Int{
    return n1 + n2;
}
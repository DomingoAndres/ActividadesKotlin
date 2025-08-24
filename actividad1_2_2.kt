fun main(){
    
    //Ejercicios de la guia 1.2.2

    
    //Variable tipo Int y Double
    var myInt: Int = 5

    var myDouble: Double = 7.5

    //Operaciones aritmeticas
    var sum = myInt + myDouble

    var resta = myInt - myDouble

    var multiplicacion = myInt * myDouble

    var division = myDouble / myInt

    
    //Imprimimos Resultados
    println("El resultado de la suma es: $sum")

    println("\nEl resultado de la resta es: $resta")

    println("\nEl Resultado de la multiplicacion es: $multiplicacion")

    println("\nEl resultado de la division es: $division")


    
    
    //Seguridad antes Nulos
    var myString: String? = "Soy un String y puedo ser nulo"
    println("\nLongitud inicial del String: ${myString?.length}")

    myString = null

    println("\n La nueva longitud del String es: ${myString?.length}")

    // En Java, para evitar un NullPointerException al acceder a la longitud de un String que puede ser nulo,
    // se debe hacer una verificación explícita, por ejemplo:
    // if (myString != null) {
    //     System.out.println(myString.length());
    // } else {
    //     System.out.println("null");
    // }



    //Logica condicional con when
    var dia: Int = 10

    when (dia){
        1 -> {
            println("\nEL dia es Lunes")
        } 2 -> {
            println("\nEL dia es Martes")
        } 3 -> {
            println("\nEL dia es Miercoles")
        } 4 -> {
            println("\nEL dia es Jueves")
        } 5 -> {
            println("\nEL dia es Viernes")
        } 6 -> {
            println("\nEL dia es Sábado")
        } 7 -> {
            println("\nEL dia es Domingo")
        } else -> {
            println("\nNo se que dia es :c")
        }
    }
}
fun main(){

    //Ejercicio1
    val calificaciones = listOf(7, 4, 8, 10, 2, 5, 3)

    val aprobados = calificaciones.filter{it >= 4}

    println("Notas aprobatorias: $aprobados")

    val promedio = aprobados.average()

    println("\nEl promedio de las notas aprobatorias es: $promedio\n")


    //Ejercicio 2

    val empleados = listOf("Juan", "Pedro", "Diego")

    val productos = mapOf("Manzanas" to 100, "Naranjas" to 80)

    var contador: Int = 1
    empleados.forEach{
        println("$contador. $it\n") 
        contador++
    }

    productos.forEach { (clave, valor) -> 
        println("El stock disponible de $clave es: $valor")
    }
}
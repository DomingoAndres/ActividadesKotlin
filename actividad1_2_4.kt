fun main(){
    
    val producto1 = mapOf("Nombre" to "Laptop Gamer", "Precio" to 250.50, "Categoria" to "Tecnologia")
    val producto2 = mapOf("Nombre" to "Libro de Kotlin", "Precio" to 45.20, "Categoria" to "Libros")

    val inventario = listOf(producto1, producto2)

    fun buscar(nombre: String, inventario:List<Map<String, Any>>){
        var encontrado = false
        for(producto in inventario){
            if(producto["Nombre"] == nombre){
                println(producto)
                encontrado = true
                break
            }
        }
        if (!encontrado) {
            println(null)
        }
    }

    fun calcularPromedio(inventario: List<Map<String, Any>>) {
        var suma = 0.0         //  para ir sumando el precio de los productos
        var cantidad = 0       //  para ir contando los productos

        for (producto in inventario) {   //  Recorre cada producto del inventario
            val precio = producto["Precio"] as? Double ?: 0.0 //  Obtiene el precio del producto. Si no es Double o es nulo, usa 0.0
            suma += precio     //  Suma el precio al total
            cantidad++         //  Aumenta el contador de productos
        }

        val promedio = if (cantidad > 0) suma / cantidad else 0.0 //  Calcula el promedio solo si hay productos, si no, deja 0.0
        println(promedio)      //  Imprime el promedio calculado
    }    

    val categorias = inventario.filter{it["Categoria"] == "Libros"}
    println(categorias)

    val nombres = inventario.map{it["Nombre"]}

    println(nombres)
}
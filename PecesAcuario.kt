package acuario

//definimos una interfaz para las acciones del pez
interface AccionPez {
    fun comer()
}

//definimos una clase abstracta con una propiedad abstracta (Color)
abstract class Pez {
    abstract val color: String
}

//creamos la clase tiburon y esta hereda e implementa de la clase abstracta y la interfaz
class Tiburon : Pez(), AccionPez {
    override val color: String = "Gris"
    override fun comer() {
        println("Tiburón: cazar y comer peces")
    }
}

//la clase pezPayaso tambien hereda e implementa de la clase abstracta y la interfaz
class PezPayaso : Pez(), AccionPez {
    override val color: String = "Dorado"
    override fun comer() {
        println("Pez Payaso: comer algas")
    }
}

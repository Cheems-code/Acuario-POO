package acuario

fun construirAcuario() {
    /*
    val acuario6 = Acuario(numeroDePeces = 29)
    acuario6.imprimirTamano()

    val acuario7 = Acuario(numeroDePeces = 29)
    acuario7.imprimirTamano()
    acuario7.volumen = 70
    acuario7.imprimirTamano()

    val acuario8 = Acuario(largo = 25, ancho = 25, alto = 40)
    acuario8.imprimirTamano()

    val miAcuario = Acuario(ancho = 25, largo = 25, alto = 40)
    miAcuario.imprimirTamano()

    val miTorre = TanqueTorre(diametro = 25, alto = 40)
    miTorre.imprimirTamano()
    */
}

fun crearPeces() {
    val tiburon = Tiburon()
    val pezPayaso= PezPayaso()

    println("El color del tiburon es : ${tiburon.color}")
    tiburon.comer()
    println("El color del pez payaso es : ${pezPayaso.color}")
    pezPayaso.comer()
}
fun main() {
    construirAcuario()
    crearPeces()
}

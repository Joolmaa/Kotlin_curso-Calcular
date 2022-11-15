/**
 * Calcular a média ponderada
 * entre três valores
 * nota, nota2, nota3
 * peso1, peso2, peso3
 *
 * peso1 = 2
 * peso2 = 3
 * peso3 = 4
 *
 * mediaPonderada = ( (note1*peso1) + (nota2*peso2) + (nota3*peso3) ) / (peso1+peso2+peso3)
 *
 */

fun main(){

    val peso1:Int = 2
    val peso2:Int = 3
    val peso3:Int = 4

    print("Disite a 1 nota:")
    var nota1:Double = readLine()!!.toDouble()

    print("Disite a 2 nota:")
    var nota2:Double = readLine()!!.toDouble()

    print("Disite a 3 nota:")
    var nota3:Double = readLine()!!.toDouble()

    /* var mediaPonderada =

        ((nota1*peso1) + (nota2*peso2) + (nota3*peso3)) /
                (peso1+peso2+peso3)*/

    var mediaPonderada = calcularMediaPonderada(nota1,nota2,nota3,peso1,peso2,peso3)

mostrarResultado(mediaPonderada)



}


fun calcularMediaPonderada(nota1:Double,
                           nota2:Double,
                           nota3:Double,
                           peso1:Int,
                           peso2:Int,
                           peso3:Int): Double{

var mediaPonderada = ((nota1*peso1) + (nota2*peso2) + (nota3*peso3)) /
        (peso1+peso2+peso3)

    return (mediaPonderada)
}

fun mostrarResultado(mediaPonderada:Double){

    return print("Média Ponderada Calculada: $mediaPonderada")

}
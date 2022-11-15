/**
 * Calcular a área do triãngulo
 * Àrea = (base*altura) /2
 *
 */

fun main(){

    print("Cálculo da àre do Trângulo\n")

    print("Informe a medida da base:")
var base: Int = readLine()!!.toInt()

    print("Informar a medida da altura: ")
    var altura: Int = readLine()!!.toInt()

    var areaDoTriangulo = calcularAreaDoTriangulo(base, altura)

    print(" A área é igual a = $areaDoTriangulo")

}

fun calcularAreaDoTriangulo(base:Int, altura:Int):Int{

    return (base * altura) / 2
}
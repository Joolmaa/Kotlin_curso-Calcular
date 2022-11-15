/**
 * Conversor de Medidas
 *
 * 1 pé = 12 polegadas
 *
 * 1 jarda = 3 pés
 *
 * 1 milha = 1.760 jardas
 *
 * Converter pés em polegadas = pés * 12
 * Converter pés  em jardas = pés / 3
 * Converter pés em Milhas = jardas / 1760
 *
 * Outras possibilidades:
 *
 * -Distância, Peso , Velocidade
 *
 */
fun main() {

    println("*** CONVERSOR DE MEDIDAS ***\n\n")
    println("Informe a quantidade de pés:")

    var pes: Int = readLine()!!.toInt()

    var polegadas = converterPesEmPolegadas(pes)
    print("$pes pés valem, valem $polegadas polegadas\n")

    var jardas = converterPesEmJardas(pes)
    print("$pes pés, valem $jardas jardas\n")

    var milhas = converterPesEmMilhas(jardas)
    print("$pes pés, valem $milhas milhas\n")
}

/**
 *  *Coverter pés em polegadas = pes * 12
 */
fun converterPesEmPolegadas(pes: Int): Int {

    return pes * 12
}
/**
 * Converter pés em jardas = pes / 3
 */
fun converterPesEmJardas(pes: Int):Double{

    return pes / 3.0
}
/**
 * Converter pés em Milhas = jardas / 1760
 */
fun converterPesEmMilhas(jardas:Double):Double{

    return jardas / 1760
}
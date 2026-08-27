/*****************************************************************************************************************************************************************
 * Objetivo: Ar uivo para testar as possibilidades da linguagem
 * Data: 17/08/2026
 * Autor: Lucas Kolle
 * Versão: 1.0.8.26
 *****************************************************************************************************************************************************************/

fun main() {

    val numeros = (1 .. 10).toList() // Criando o array / lista de números usando um intervalo de 1 a 10
    val dobro = numeros.map { numero -> numero * 2} // map => para cada item, faça isso (multiplicar por 2)
    println(dobro) // Printando o dobro

    val soma = numeros.reduce { acumulador, numero -> acumulador + numero }
    println(soma) // Printando a soma

    val result = numeros
        .filter { it % 2 == 0 }
        .map { it * 2 }
        .reduce { acc, n -> acc + n }
}

// Importando o arquivo / classe da classe "Carro" que nós criamos
import model.Carro
import model.CarroTunado

/*****************************************************************************************************************************************************************
 * Objetivo: Ar uivo para testar as possibilidades da linguagem
 * Data: 17/08/2026
 * Autor: Lucas Kolle
 * Versão: 1.0.8.26
 *****************************************************************************************************************************************************************/

fun main() {

    val numeros = (1 .. 10).toList() // Criando o array / lista de números usando um intervalo de 1 a 10

    val pares = numeros.filter { it % 2 == 0 } // Faz um filtro dentro do array / lista (se o resto da divisão for 0 ele continua na lista)
    println(pares)

    val dobro = numeros.map { numero -> numero * 2} // map => para cada item, faça isso (multiplicar por 2)
    println(dobro) // Printando o dobro

    val soma = numeros.reduce { acumulador, numero -> acumulador + numero } //
    println(soma) // Printando a soma

    val result = numeros // Somando o dobro dos pares de um array / lista
        .filter { it % 2 == 0 } // Separando os pares dos impares
        .map { it * 2 } // Multiplicando os pares obtidos por 2 (pegando o dobro)
        .reduce { acc, n -> acc + n } // Somando o dobro dos pares obtidos anteriormente
    println(result) // Printando o resultado (Soma do dobro dos pares de um array / lista)

    // chamando a classe para ser usada aqui (parecida com a função)
    val carro1 = Carro() //("Celta", 2000)
    //val carro2 = Carro ("Veloster", 2011, 3) // Mudando o valor "portas" para esse carro

    // Mostrando no terminal os conteúdos referente o carro
    println()
    println(carro1)
    println(carro1.modelo)
    println(carro1.ano)
    carro1.acelerar()

    // Atribuindo / modificando os atributos da classe
    carro1.modelo = "Fusca"
    carro1.ano = 1994

    // Mostrando no terminal os conteúdos referente o carro
    println()
    println(carro1)
    println(carro1.modelo)
    println(carro1.ano)
    carro1.acelerar()

    // Adicionando quilometros no carro para poder consultar depois
    println()
    carro1.acelerar()
    carro1.rodar(22.5)
    carro1.acelerar()
    carro1.rodar(1_000.33)
    println(carro1.consultarKm())

    // Criando carros por meio da classe "CarroTunado"
    val  carroTunado = CarroTunado()
    carroTunado.modelo = "skyline"
    carroTunado.ano = 1999
    carroTunado.ranking = 'S'

    println()
    println(carroTunado.modelo)
    println(carroTunado.ano)
    println(carroTunado.ranking)
    carroTunado.acelerar()
}

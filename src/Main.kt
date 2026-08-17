// Comentário em linha

/*
    * Comentário
    * Em
    * Blocos
*/

/*
    Variáveis em Kotlin:

        var => o valor pode ser alterado
        var idade = 27

        val => O valor não pode ser alterado
        val pi = 3.14
*/

fun main() {

    val pi= 3.14 // Deixando o kotlin adicionar o tipo de variável
    var idade: Int  = 27 // Adicionando o tipo de variável manualmente

    val texto: String = "Bom dia, pessoal!"

    println(texto) // Mostra apenas o texto
    println(texto.length) // Mostra o tamanho do texto
    println(texto.uppercase()) // Deixa texto em maiúsculo
    println(texto.contains("pessoal")) //  Veifica se o "pessoal" existe na String que foi passada. .contains => contém
    println("Bom dia, pessoal! Eu tenho ${idade} anos, mas daqui um ano terei ${idade + 1}!")

    // Formas de quebrar a linha:
    println("""
        Texto
        escrito em varias
        linhas""")
    println("texto\nEscrito em varias\nLinhas")


    val letra = 'j' // Para guardar um único caracter, devemos usar aspas simples, para ser inferido a tipagem "Char"
    println(letra)

    val populacao = 7_000_000_000_000L // Ao colocar o "L"ao final do número, ele infere que será um Long ou seja, receberá um número grande
    println(populacao)

}
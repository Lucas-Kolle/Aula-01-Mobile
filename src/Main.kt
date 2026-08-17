/*****************************************************************************************************************************************************************
 * Objetivo: Estudo dos conceitos básicos da linguagem Kotlin
 * Data: 17/08/2026
 * Autor: Lucas Kolle
 * Versão: 1.0.8.26
 *****************************************************************************************************************************************************************/

fun main() {

    /*
    ************************************************************************************************************************************************************
    VARIÁVEIS
    ************************************************************************************************************************************************************

    Em Kotlin existem duas formas principais de criar variáveis:

    val -> Cria uma variável que NÃO pode receber outro valor depois de criada.
           É semelhante a uma constante em outros contextos.
           Recomendação: utilize val sempre que o valor não precisar ser alterado.

    var -> Cria uma variável que PODE receber outro valor durante a execução do programa.
           Deve ser utilizada quando o valor realmente precisar ser alterado.

    Exemplos:

    val nome = "Lucas"
    var idade = 18

    idade = 19       // Permitido porque idade foi criada com var

    nome = "João"    // ERRO! nome foi criado com val


    IMPORTANTE:

    Kotlin NÃO possui "let" e "const" para declaração de variáveis como no JavaScript.

    No Kotlin:

    val -> valor que não será alterado
    var -> valor que pode ser alterado
*/


    /*
        ************************************************************************************************************************************************************
        TIPOS DE DADOS
        ************************************************************************************************************************************************************

        Kotlin possui tipagem estática. Isso significa que cada variável possui um tipo definido.

        String  -> Texto

        Int     -> Número inteiro

        Double  -> Número decimal com maior precisão

        Float   -> Número decimal

        Boolean -> Verdadeiro ou falso

        Char    -> Um único caractere

        Long    -> Número inteiro que suporta valores maiores

        Exemplos:
    */

    val nome: String = "Lucas"
    val idade: Int = 18
    val altura: Double = 1.75
    val peso: Double = 75.0
    val aprovado: Boolean = true
    val inicial: Char = 'L'


    /*
        Kotlin também consegue identificar automaticamente o tipo da variável.

        Exemplo:
    */

    val nome2 = "Lucas"
    val idade2 = 18
    val altura2 = 1.75

    /*
        Nesse caso não precisamos escrever:

        val nome2: String = "Lucas"

        O Kotlin identifica automaticamente que "Lucas" é uma String.

        Essa característica é chamada de INFERÊNCIA DE TIPO.
    */


    /*
        ************************************************************************************************************************************************************
        OPERADORES ARITMÉTICOS
        ************************************************************************************************************************************************************

        +  -> Adição
        -  -> Subtração
        *  -> Multiplicação
        /  -> Divisão
        %  -> Resto da divisão

        Exemplos:
    */

    val soma = 10 + 5
    val subtracao = 10 - 5
    val multiplicacao = 10 * 5
    val divisao = 10 / 5
    val resto = 10 % 3


    /*
        ************************************************************************************************************************************************************
        OPERADORES DE COMPARAÇÃO
        ************************************************************************************************************************************************************

        ==  -> Verifica se dois valores são iguais

        !=  -> Verifica se dois valores são diferentes

        <   -> Menor que

        >   -> Maior que

        <=  -> Menor ou igual

        >=  -> Maior ou igual

        Exemplos:

        idade == 18
        idade != 18
        idade < 18
        idade > 18
        idade <= 18
        idade >= 18


        IMPORTANTE:

        No Kotlin NÃO utilizamos:

        === -> como no JavaScript para comparação de tipo e valor

        No Kotlin, == é utilizado para comparar igualdade de valores.

        === é utilizado para verificar se duas referências apontam para o MESMO OBJETO.
    */


    /*
        ************************************************************************************************************************************************************
        OPERADORES LÓGICOS
        ************************************************************************************************************************************************************

        &&  -> E (AND)
               Todas as condições precisam ser verdadeiras.

        ||  -> OU (OR)
               Pelo menos uma condição precisa ser verdadeira.

        !   -> NÃO (NOT)
               Inverte o resultado de uma condição.

        Exemplos:

        idade >= 18 && idade <= 60

        idade < 18 || idade > 60

        !aprovado
    */


    /*
        ************************************************************************************************************************************************************
        ENTRADA DE DADOS
        ************************************************************************************************************************************************************

        readln() -> Permite receber uma informação digitada pelo usuário.

        Por padrão, o readln() recebe o conteúdo como String.

        Exemplo:
    */

    print("Digite seu nome: ")
    val nomeUsuario = readln()

    /*
        Para receber números precisamos converter o valor recebido.

        toInt()    -> Converte para número inteiro

        toDouble() -> Converte para número decimal

        toFloat()  -> Converte para Float

        toLong()   -> Converte para Long

        Exemplos:
    */

    print("Digite sua idade: ")
    val idadeUsuario = readln().toInt()

    print("Digite sua altura: ")
    val alturaUsuario = readln().toDouble()


    /*
        ************************************************************************************************************************************************************
        CONVERSÃO DE TIPOS DE DADOS
        ************************************************************************************************************************************************************

        Kotlin utiliza funções como:

        toInt()    -> Converte para Int

        toDouble() -> Converte para Double

        toFloat()  -> Converte para Float

        toLong()   -> Converte para Long

        toString() -> Converte para String

        toBoolean() -> Converte para Boolean

        Exemplos:
    */

    val textoNumero = "100"

    val numeroInteiro = textoNumero.toInt()

    val textoDecimal = "10.5"

    val numeroDecimal = textoDecimal.toDouble()

    val numero = 100

    val texto = numero.toString()


    /*
        IMPORTANTE:

        Diferente do JavaScript, Kotlin não possui:

        Number()
        String()
        Boolean()
        parseInt()
        parseFloat()

        Para conversões simples, utilizamos principalmente:

        .toInt()
        .toDouble()
        .toString()
    */


    /*
        ************************************************************************************************************************************************************
        SAÍDA DE DADOS
        ************************************************************************************************************************************************************

        print() -> Mostra uma informação na tela sem pular linha.

        println() -> Mostra uma informação na tela e pula para a próxima linha.

        Exemplos:
    */

    print("Olá ")
    print("Lucas")

    println("Olá")
    println("Lucas")


    /*
        ************************************************************************************************************************************************************
        INTERPOLAÇÃO DE STRING
        ************************************************************************************************************************************************************

        Podemos colocar o conteúdo de uma variável dentro de uma String utilizando:

        $variavel

        Para expressões matemáticas ou expressões maiores:

        ${expressao}

        Exemplo:
    */

    val nomeAluno = "Lucas"
    val nota = 85

    println("Aluno: $nomeAluno")
    println("Nota: $nota")

    println("Resultado: ${nota + 5}")



    /*
    ************************************************************************************************************************************************************
    FUNÇÕES
    ************************************************************************************************************************************************************

    Uma função é um bloco de código criado para realizar uma determinada tarefa.

    Utilizamos a palavra:

    fun

    Estrutura:

    fun nomeDaFuncao(){

        // código

    }

    Exemplo:
*/

    fun mostrarMensagem(){

        println("Olá, mundo!")

    }


    /*
        Para executar a função:

        mostrarMensagem()
    */


    /*
        ************************************************************************************************************************************************************
        FUNÇÕES COM PARÂMETROS
        ************************************************************************************************************************************************************

        Podemos enviar informações para uma função através dos parâmetros.

        Exemplo:
    */

    fun mostrarNome(nome: String){

        println("Nome: $nome")

    }


    /*
        Chamando a função:

        mostrarNome("Lucas")
    */


    /*
        ************************************************************************************************************************************************************
        FUNÇÕES COM RETORNO
        ************************************************************************************************************************************************************

        Uma função pode realizar um cálculo e devolver um resultado.

        Para definir o tipo de retorno, colocamos o tipo depois dos parâmetros.

        Exemplo:
    */

    fun somar(numero1: Int, numero2: Int): Int{

        return numero1 + numero2

    }


    /*
        Chamando a função:

        val resultado = somar(10, 20)

        resultado receberá:

        30
    */

    fun somarRefatorada(a: Int, b: Int) = a + b // Função refadorada, parecida com a arrow function do JS


    /*
        ************************************************************************************************************************************************************
        FUNÇÃO PRINCIPAL - MAIN
        ************************************************************************************************************************************************************

        A função main() é o ponto de entrada do programa.

        É nela que normalmente começa a execução do código.

        Exemplo:
    */

    fun main(){

        println("**** INICIANDO APLICATIVO ****")

    }


}

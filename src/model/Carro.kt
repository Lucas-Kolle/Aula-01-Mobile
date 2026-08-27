package model

// Criando uma classe no Kotlin
open class Carro/*( // Open => permite que outras classes herdem suas caracteristicas
   var modelo: String,
    var ano: Int,
    var portas: Int = 4 // Quando o valor é adicionado na própria classe ele fica padrão, mas pode ser alterado se necessário
)*/ {

    // Crando atributos da classe
    var modelo: String = ""
        get() {
            return field.uppercase() // Pedindo pro modelo ser enviado em letras maiusculas quando for solicitado
        }

    var ano: Int = 0
        set(value) {
            field = if (value >= 0) value else 0 // fazendo tratativa na hora de salvar / alterar o ano (proibido numeros negativos)
        }

    // atributo privado (não pode ser acessada fora da classe)
    private var kilometragem: Double = 0.0

    // Criando um metodo
    open fun acelerar() { // open => Permite que ele seja usado pelos seus "filhos" / "herdeiros"
        println("Método acelerar Chamado! vrum-vrum")

    }

    fun rodar(km: Double) {
        kilometragem += km
    }

    fun consultarKm(): String {
        return "O carro está com $kilometragem km"
    }

    // Roda o "innit" quando o carro é criado
    init {
        println("---------------------------------------------------------------")
        println("O seu carro foi criado com sucesso!")
        println("Modelo: $modelo")
        println("Ano: $ano")
    //  println("Portas: $portas")
        println("---------------------------------------------------------------")
    }
}
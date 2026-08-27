package model

// Fazendo a classe "CarroTunado" herde caracteristicas da classe "Carro"
class CarroTunado: Carro() {

    // criando atributo ranking que começa no mais baixo "f"
    var ranking: Char = 'f'

    // modificando o metodo herdado
    override fun acelerar() {
        println("vrummmm-tzuuu-tututu vrummmmmmmmm-tzuu-tutututu")
    }
}
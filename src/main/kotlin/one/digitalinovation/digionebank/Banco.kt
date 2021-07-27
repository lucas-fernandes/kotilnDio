package one.digitalinovation.digionebank

data class Banco(
    val nome: String,
    val numero: Int
){
    fun info() = "Info Bank -> Nome: $nome | Numero: $numero"
}

package one.digitalinovation.digionebank

data class Banco(
    val nome: String,
    val numero: Int
){
    fun info() = "Nome: $nome | Numero: $numero"
}

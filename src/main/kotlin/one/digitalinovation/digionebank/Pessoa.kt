package one.digitalinovation.digionebank

class Pessoa {
    var nome:String = "Lucas Fernandes"

    var cpf:String = "999.999.999-99"
    private set

    constructor()

    fun pessoaInfo() = "Nome: $nome e CPF: $cpf"

    /** Classe interna
        inner class Endereco{
            var rua:String = "Rua teste"
        }
    **/

}

fun main(){
    val lucas = Pessoa()

    println(lucas.pessoaInfo())

}

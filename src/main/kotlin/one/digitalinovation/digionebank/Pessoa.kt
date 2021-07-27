package one.digitalinovation.digionebank

class Pessoa {
    var nome:String = "Lucas Fernandes"
    var cpf:String = "999.999.999-99"

}

fun main(){
    val lucas = Pessoa()

    println(lucas.nome)
    println(lucas.cpf)
}
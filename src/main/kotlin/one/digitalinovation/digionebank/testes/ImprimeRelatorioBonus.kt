package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Funcionario

class ImprimeRelatorioBonus {
    companion object{
        fun imprime(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}
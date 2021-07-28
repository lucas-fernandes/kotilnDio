package one.digitalinovation.digionebank.testes

import one.digitalinovation.digionebank.Analista

fun main() {
    val joao = Analista("Joao Silva", "12345654", 2000.0)
    ImprimeRelatorioBonus.imprime(joao)

}
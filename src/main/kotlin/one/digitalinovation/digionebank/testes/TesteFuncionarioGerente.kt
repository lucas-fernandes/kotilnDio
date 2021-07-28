package one.digitalinovation.digionebank

import one.digitalinovation.digionebank.testes.ImprimeRelatorioBonus

fun main() {
    val maria = Gerente("Maria Galvao", "1234544654", 5000.0)
    ImprimeRelatorioBonus.imprime(maria)

}
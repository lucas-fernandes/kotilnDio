package one.digitalinovation.digionebank

class Analista(
    nome: String,
    cpf: String,
    salario: Double
): Funcionario(nome, cpf, salario) {
    override fun calculoBonus() = salario * 0.1 // salario *= 0.1

}
import java.text.DecimalFormat

data class Funcionario(
        val nomeCompleto: String,
        val sexo: String,
        val idade: Int,
        val cargo: String,
        val salario: Double
)

fun main() {
    val funcionarios = listOf(
            Funcionario("Ana Silva", "Feminino", 32, "Gerente de Vendas", 5000.00),
            Funcionario("Pedro Santos", "Masculino", 28, "Analista de RH", 4200.00),
            Funcionario("Maria Oliveira", "Feminino", 35, "Engenheiro", 5500.00),
            Funcionario("João Souza", "Masculino", 40, "Designer Gráfico", 4000.00),
            Funcionario("Clara Pereira", "Feminino", 26, "Analista de Marketing", 3700.00),
            Funcionario("Luiz Garcia", "Masculino", 45, "Diretor de Operações", 8000.00),
            Funcionario("Beatriz Ferreira", "Feminino", 30, "Desenvolvedor Front-End", 4800.00),
            Funcionario("Bruno Lima", "Masculino", 33, "Analista de Finanças", 4500.00),
            Funcionario("Juliana Rodrigues", "Feminino", 29, "Estagiário de Marketing", 2000.00),
            Funcionario("Lucas Barbosa", "Masculino", 27, "Gerente de Projetos", 6000.00),
            Funcionario("Sofia Almeida", "Feminino", 31, "Analista de Sistemas", 5200.00),
            Funcionario("Gustavo Carvalho", "Masculino", 24, "Analista de RH", 3800.00),
            Funcionario("Larissa Gonçalves", "Feminino", 18, "Designer Gráfico", 4100.00),
            Funcionario("Daniel Ribeiro", "Masculino", 25, "Engenheiro de Software", 4700.00),
            Funcionario("Isabela Santos", "Feminino", 23, "Analista de Marketing", 3600.00),
            Funcionario("Rafael Oliveira", "Masculino", 37, "Desenvolvedor Front-End", 4900.00),
            Funcionario("Manuela Alves", "Feminino", 39, "Diretor de Operações", 7500.00),
            Funcionario("Thiago Ferreira", "Masculino", 33, "Analista de Finanças", 4300.00),
            Funcionario("Mariana Lima", "Feminino", 26, "Analista de Sistemas", 5200.00),
            Funcionario("Gabriel Barbosa", "Masculino", 30, "Gerente de Vendas", 5100.00),
            Funcionario("Sophia Carvalho", "Feminino", 31, "Analista de Marketing", 3800.00),
            Funcionario("Matheus Rodrigues", "Masculino", 29, "Designer Gráfico", 4100.00),
            Funcionario("Laura Ribeiro", "Feminino", 25, "Engenheiro", 5500.00),
            Funcionario("Bernardo Silva", "Masculino", 26, "Analista de Finanças", 4400.00),
            Funcionario("Valentina Gonçalves", "Feminino", 35, "Gerente de Projetos", 5900.00),
            Funcionario("Enzo Almeida", "Masculino", 27, "Desenvolvedor Front-End", 4700.00),
            Funcionario("Giovanna Oliveira", "Feminino", 30, "Analista de RH", 4000.00),
            Funcionario("Lucca Ferreira", "Masculino", 28, "Analista de Sistemas", 5200.00),
            Funcionario("Maria Clara Lima", "Feminino", 34, "Estagiário de Marketing", 2100.00),
            Funcionario("Miguel Santos", "Masculino", 32, "Diretor de Operações", 7200.00),
            Funcionario("Berenice Barbosa", "Feminino", 30, "Gerente de Vendas", 5300.00),
            Funcionario("Pedro Henrique Carvalho", "Masculino", 26, "Designer Gráfico", 4500.00),
            Funcionario("Manuela Rodrigues", "Feminino", 29, "Analista de Finanças", 4200.00),
            Funcionario("Davi Ribeiro", "Masculino", 33, "Engenheiro de Software", 5800.00),
            Funcionario("Helena Almeida", "Feminino", 27, "Analista de RH", 4000.00),
            Funcionario("Bernardo Ferreira", "Masculino", 25, "Analista de Marketing", 3600.00),
            Funcionario("Mariana Lima", "Feminino", 31, "Desenvolvedor Front-End", 4900.00),
            Funcionario("Sophia Oliveira", "Feminino", 28, "Gerente de Projetos", 5400.00),
            Funcionario("Gabriel Barbosa", "Masculino", 34, "Analista de Sistemas", 5500.00),
            Funcionario("Laura Carvalho", "Feminino", 26, "Analista de Marketing", 4100.00),
            Funcionario("Valentina Ribeiro", "Feminino", 29, "Designer Gráfico", 4600.00),
            Funcionario("Enzo Santos", "Masculino", 31, "Analista de Finanças", 4200.00),
            Funcionario("Giovanna Gonçalves", "Feminino", 30, "Engenheiro de Software", 5600.00),
            Funcionario("Lucca Lima", "Masculino", 26, "Analista de RH", 3900.00),
            Funcionario("Maria Clara Almeida", "Feminino", 32, "Estagiário de Marketing", 2200.00),
            Funcionario("Miguel Oliveira", "Masculino", 27, "Gerente de Vendas", 5200.00),
            Funcionario("Alice Barbosa", "Feminino", 35, "Diretor de Operações", 7500.00),
            Funcionario("Pedro Henrique Carvalho", "Masculino", 28, "Desenvolvedor Front-End", 4700.00),
    )

    val homemMaisVelho = funcionarios.filter { it.sexo == "Masculino" }.maxByOrNull { it.idade }

    val mulherMaisVelha = funcionarios.filter { it.sexo == "Feminino" }.maxByOrNull { it.idade }

    val homemMaisNovo = funcionarios.filter { it.sexo == "Masculino" }.minByOrNull { it.idade }

    val mulherMaisNova = funcionarios.filter { it.sexo == "Feminino" }.minByOrNull { it.idade }

    val idadeMediaHomens = funcionarios.filter { it.sexo == "Masculino" }.map { it.idade }.average()

    val idadeMediaMulheres = funcionarios.filter { it.sexo == "Feminino" }.map { it.idade }.average()

    val idadeMediaGeral = funcionarios.map { it.idade }.average()

    val homemComMaiorSalario = funcionarios.filter { it.sexo == "Masculino" }.maxByOrNull { it.salario }

    val homemComMenorSalario = funcionarios.filter { it.sexo == "Masculino" }.minByOrNull { it.salario }

    val mulherComMaiorSalario = funcionarios.filter { it.sexo == "Feminino" }.maxByOrNull { it.salario }

    val mulherComMenorSalario = funcionarios.filter { it.sexo == "Feminino" }.minByOrNull { it.salario }

    val mediaSalarioHomens = funcionarios.filter { it.sexo == "Masculino" }.map { it.salario }.average()

    val mediaSalarioMulheres = funcionarios.filter { it.sexo == "Feminino" }.map { it.salario }.average()

    val mediaSalarioGeral = funcionarios.map { it.salario }.average()

    val diretorComMaiorSalario = funcionarios.filter { it.cargo.contains("Diretor", ignoreCase = true) }
            .maxByOrNull { it.salario }

    val pessoaComMaiorNome = funcionarios.maxByOrNull { it.nomeCompleto.length }

    val pessoasCom18Anos = funcionarios.filter { it.idade == 18 }

    val pessoasComNomeIniciadoEmA = funcionarios.filter { it.nomeCompleto.startsWith("A", ignoreCase = true) }

    val formato = DecimalFormat("#0.00")

    val mediaIdadeHomensFormatado = formato.format(idadeMediaHomens)
    val mediaIdadeGeralFormatado = formato.format(idadeMediaGeral)
    val mediaSalarioHomensFormatado = formato.format(mediaSalarioHomens)
    val mediaSalarioGeralFormatado = formato.format(mediaSalarioGeral)

    println("Homem mais velho: ${homemMaisVelho?.nomeCompleto}")
    println("Mulher mais velha: ${mulherMaisVelha?.nomeCompleto}")
    println("Homem mais novo: ${homemMaisNovo?.nomeCompleto}")
    println("Mulher mais nova: ${mulherMaisNova?.nomeCompleto}")
    println("Média de idade dos homens: $mediaIdadeHomensFormatado")
    println("Média de idade das mulheres: $idadeMediaMulheres")
    println("Média de idade independente do sexo: $mediaIdadeGeralFormatado")
    println("Homem com o maior salário: ${homemComMaiorSalario?.nomeCompleto}")
    println("Homem com o menor salário: ${homemComMenorSalario?.nomeCompleto}")
    println("Mulher com o maior salário: ${mulherComMaiorSalario?.nomeCompleto}")
    println("Mulher com o menor salário: ${mulherComMenorSalario?.nomeCompleto}")
    println("Média de salários dos homens: $mediaSalarioHomensFormatado")
    println("Média de salários das mulheres: $mediaSalarioMulheres")
    println("Média de salários independente do sexo: $mediaSalarioGeralFormatado")
    println("Diretor com o maior salário: ${diretorComMaiorSalario?.nomeCompleto}")
    println("Pessoa com o maior nome na empresa: ${pessoaComMaiorNome?.nomeCompleto}")
    println("Pessoas com 18 anos: ")
    pessoasCom18Anos.forEach { println(it.nomeCompleto) }
    println("Pessoas com nome iniciado em 'A':")
    pessoasComNomeIniciadoEmA.forEach { println(it.nomeCompleto) }
}

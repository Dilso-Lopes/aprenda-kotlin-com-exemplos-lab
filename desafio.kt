// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(var nome: String)

data class ConteudoEducacional(var nome: String, var nivel: String, val duracao: Int = 60)

data class Formacao(var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("$inscritos $conteudos")
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    var usuario = Usuario("Marcos")
    var conteudo: MutableList<ConteudoEducacional> = mutableListOf<ConteudoEducacional>()
  	var nivel = Nivel.BASICO
    val nivel_selecionado = when (nivel){
       Nivel.BASICO -> "Básico"
       Nivel.INTERMEDIARIO -> "Intermediário"
       Nivel.AVANCADO -> "Avançado"
    }
    conteudo.add(ConteudoEducacional("Inglês", nivel_selecionado))
    val formacao = Formacao(conteudo)
    formacao.matricular(usuario)
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}

package br.com.aline.exercicio17

fun main(){
    val calculo = CalculoMatematico()

    try {
        calculo.divisao(4,0)
    }catch (ex:ArithmeticException){
        println(ex.message)
    }

}
package br.com.aline.exercicio17

fun main(){
    try{
    val lista: MutableList<String> = mutableListOf()
    lista.add("Pato")
    lista.add("Cachorro")
    lista.add("Gato")
    println(lista[3])
    }catch (ex:IndexOutOfBoundsException){
        println("Ocorreu uma exceção ${ex.message} devido a ${ex.cause}")
    }
}
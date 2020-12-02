package br.com.aline.exercicio17

class CalculoMatematico() {
//    fun divisao(x: Int, y:Int):Int{
//        try {
//            val div = x / y
//            return div
//        }catch (ex:ArithmeticException){
//            println("Operação não pode ser realizada devido a ${ex.cause}")
//            return 0
//        }
//
//    }

    fun divisao(x: Int, y:Int): Int{
        val div: Int
        if (y == 0)
            throw ArithmeticException("Operação não pode ser realizada devido a divisão por zero")
        else{
            div = x / y
            return div
        }
    }


}
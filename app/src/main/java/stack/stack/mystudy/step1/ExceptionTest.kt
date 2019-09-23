package stack.stack.mystudy.step1

import stack.stack.mystudy.TestClass

class ExceptionTest (p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        //    var divNumber = 0
        //    try{
        //        707 / divNumber
        //    }catch (e: Exception){
        //        println(e)
        //    }finally{
        //        println("Last")
        //    }

        var addNumber: Int? = null
        //오류 발생 var sum = addNumber + 100
        //밑에 처럼 로직으로 트라이/캐치 대신 막아줌
        //if(addNumber != null) {var sum = addNumber + 100}
        //!! 이 있으면 경각심을 가져라(아래처럼 하면 syntax error 는 안 발생함) 그러나 예외처리됨
        //var sum = addNumber !! + 100
        var sum = addNumber?.let{
            it + 100 //addNumber가 null 이면, sum도 null이 된다. 즉 오류는 발생 안함
        }
        println(sum) // null이건 아니건 간에 출력이 안됨 -> 왜지?
        println(200)
    }
}

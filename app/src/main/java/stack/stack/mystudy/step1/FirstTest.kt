package stack.stack.mystudy.step1

import stack.stack.mystudy.TestClass

class FirstTest (p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        println("종결자(;) 없어도 됩니다")
        println("var은 읽기쓰기, val는 읽기전용")

        var nCount: Int = 0
        var name = "psw"

        val age = 0
        //age++

        var MyMoney: Int? = null
        //println(message)
        var message = "위에서는 액세스 불가함"

        println(hiMessage)
    }

    val hiMessage: String = "hi"
}
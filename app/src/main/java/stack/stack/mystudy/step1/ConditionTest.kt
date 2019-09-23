package stack.stack.mystudy.step1

import stack.stack.mystudy.TestClass

class ConditionTest (p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        ifTest("Test")
        ifTest(3.5f)
        ifTest(9)
        ifTest(null)
        loopTest(9)
        caseTest(3)
        caseTest("Test")
        caseTest(null)

        var a = "ABCDE"
        val result = when(a){
            is String -> {true}
            else -> {false}
        }

        println(if ("AAA".length > 3) true else "짧아요")
    }
    fun loopTest(count: Int){
        for (i in (0..count)){
            println("i -> $i")
        }
        (0..count).forEach { println("it -> $it") }
    }

    fun caseTest(o: Any?){
        when(o){
            "Test" -> {println("문자 : $o")}
            is Float -> {println("Float : $o")}
            in (0..9) -> {println("0부터 9까지 숫자 : $o")}
            null -> {println("null!")}
        }
    }
    fun ifTest(a: Any?){
        if(a == "Test"){
            println(a)
        }else if(a is Float){
            println("Float")
        }else if(a in (0..9)){
            println("0~9 숫자 : $a")
        }else if(a == null) {
            println("null")
        }
    }
}
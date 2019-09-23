package stack.stack.mystudy.step1

import stack.stack.mystudy.TestClass

class LabelTest (p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        exitLoop()
        println(lambdaReturn())
        (0..10).forEach { if(it > 3) return@forEach else println(it) }
    }
    fun exitLoop(){
        HereToExit@ for(i in 0..2){
            for(j in 0..10){
                if(j == 5) break@HereToExit
                println("i -> $i, j -> $j")
            }
            println("j loop end")
        }
        println("i loop end")
    }

    var lambdaReturn = Exit@{
        if(true){
            return@Exit 3
        }
        1000
    }
}
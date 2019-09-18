package stack.stack.mystudy.step1

import stack.stack.mystudy.TestClass

class NumberTest( p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        var doubleV : Double = 110.1111
        var floatV  : Float  = 110.0f
        var longV   : Long   = 110
        var intV    : Int    = 20
        var shortV  : Short  = 30
        var byteV   : Byte   = 10

        println(doubleV)
        println(floatV)
        println(longV)
        println(intV)
        println(shortV)
        println(byteV)

        intV = "123".toInt() + 10
        println(intV)
    }
}
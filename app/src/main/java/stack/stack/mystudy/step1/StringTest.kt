package stack.stack.mystudy.step1

import stack.stack.mystudy.TestClass
import java.util.*

class StringTest ( p : (Any) -> Unit ) : TestClass(p){
    override fun doTest() {
        var sName = "박모씨"
        kotlin.io.println(sName + " - The Gamer")

        var sLines = """
        1
        2
        3
        4
        5
        6
        7
        8
        9
    """

        println(sLines)

        var str = "$sName <-- sName의 값"
        var sFormatter = "$sName <-- sName의 값"
        println(sFormatter)
        println(str)

        var sBash = "${"지금 시각은 - " + Date()}"
        println(sBash)
    }
}
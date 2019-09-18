package stack.stack.mystudy.step1
import stack.stack.mystudy.TestClass

class FunctionTest (p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        fun Three(n : Int) = 3 * n
        println(Three(4).toString())

        funByNoParam()
        funByParameter(31, "은 숫자입니다.")
        println(funByReturn("Parameter").toString())
        println(funByInline(31, 10))

        funVar("Function Variable 1")
        println(funcVarType("Function Variable 2").toString())

        HigherFunc ({println("HigherFunction")})
        HigherFunc (::funByNoParam)
    }
    fun funByReturn(s: String) : Any?{
        return s
    }

    fun funByParameter(i: Int, s: String){
        println(i.toString() + s)
    }

    fun funByInline(i: Int, i1: Int) = i * i1
    fun funByNoParam() = println("funByNoParam!!")
    fun HigherFunc(f:() -> Any?){
        f()
    }
    val funVar = { s: String -> println(s) }
    var funcVarType : (String) -> Any? = ::funByReturn
}
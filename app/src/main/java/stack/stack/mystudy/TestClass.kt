package stack.stack.mystudy

open class TestClass(pFunc : (Any) -> Unit) {
    companion object{
        var println : (Any) -> Unit = {}
    }

    init{
        println = pFunc
    }

    open fun doTest() {}
}
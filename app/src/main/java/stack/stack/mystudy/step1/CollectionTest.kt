package stack.stack.mystudy.step1

import stack.stack.mystudy.TestClass

class CollectionTest(p:(Any)->Unit): TestClass(p){
    override fun doTest() {
        val lst = listOf(1, 'A', 12f, false, true)
        //구닥다리
//    for(i in 0 .. lst.size - 1){
//        println(lst.get(i).toString())
//    }
        for(i in lst){ println(i.toString()) }
        println(">")

        var lstEditable = mutableListOf<String>()
        lstEditable.add("A")
        lstEditable.add("B")
        lstEditable.add("C")
        lstEditable.add("D")
        for(s in lstEditable) println(s)
        println(">")

        lstEditable.removeAt(0)
        for(s in lstEditable) println(s)

        println(">")
        var m = hashMapOf("A" to 1, "B" to 2)
        println(m)
        println(m["A"])
        println(m["B"])
    }
}
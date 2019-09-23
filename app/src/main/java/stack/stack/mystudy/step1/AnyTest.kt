package stack.stack.mystudy.step1

import stack.stack.mystudy.TestClass
import java.util.*

class AnyTest (p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        var everybody: Any
        everybody = 1111
        everybody = "문자열 테스트"
        everybody = 221.01010
        everybody = 12.00f

        //좌측의 연산자가 우측의 자료형에 해당하는가?
        if(everybody !is String){
            if(everybody is Float){
                println("Float입니다.")
            }
        }

        //everybody = null
        //everybody는 null을 허용하지 않는다.

        //everybody2는 ?를 통해 null 허용
        //null로 인해 생기는 일은 내가 책임지겠
        var everybody2 : Any?
        everybody2 = null

        println(everybody == 12.00f)
        println(everybody.equals(12.00f))

        //Any 덕에 무슨 자료형이든 다 처리가 가능
        AllPrint(123)
        AllPrint("하이")
        AllPrint(Date())
        AllPrint(true)

        //Unit형은 값이 없음을 정의하는 형
        //var pFunc : (Unit) -> Unit
        //여기서 ()안은 매개변수, -> 뒤에 나오는 Unit은 반환형
        //()안은 Unit이면 생략해도 된다. 하지만 반환형은 생략해선 안 된다.
        var pFunc : (String) -> Unit = {println (it)} // 넘겨진 매개변수가 1개면 it사용
        pFunc("하이하이하이하이")

        //Nothing형은 미래가 없음을 알리는 형
        //Exception발생시키고 프로그램을 종료시키기 위함
        //TODO를 구현하지 않았기 때문에 오류나고 종료됨
        //TODO("구현할 것 적어놓는 곳")
    }
    fun AllPrint(a : Any) = println(a.toString())
}
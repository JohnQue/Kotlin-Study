package stack.stack.mystudy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import stack.stack.mystudy.step1.AnyTest
import stack.stack.mystudy.step1.FunctionTest
import stack.stack.mystudy.step1.NumberTest
import stack.stack.mystudy.step1.StringTest

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //doTest(FirstTest(::WriteLn))
        //doTest(NumberTest(::WriteLn))
        //doTest(StringTest(::WriteLn))
        //doTest(AnyTest(::WriteLn))
        doTest(FunctionTest(::WriteLn))
    }

    open fun doTest(o : TestClass){
        o.doTest()
    }

    fun WriteLn(any : Any){
        txtMessage.text = "${txtMessage.text}${any.toString()}\n"
    }}
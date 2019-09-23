package stack.stack.mystudy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import stack.stack.mystudy.step1.ConditionTest
import stack.stack.mystudy.step1.FirstTest
import stack.stack.mystudy.step1.LabelTest

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //doTest(FirstTest(::WriteLn))
        doTest(ConditionTest(::WriteLn))
        //doTest(LabelTest(::WriteLn))
    }

    open fun doTest(o : TestClass){
        o.doTest()
    }

    fun WriteLn(any : Any){
        txtMessage.text = "${txtMessage.text}${any.toString()}\n"
    }}
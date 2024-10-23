package com.example.calculater

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculater.databinding.ActivityMainBinding
import net.objecthunter.exp4j.Expression
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private lateinit var expression: Expression
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnAc.setOnClickListener {
            binding.inputText.text = " "
            binding.outPutText.text = " "
        }

        binding.squareX.setOnClickListener {
                binding.inputText.append("^(2)")
        }

        binding.cube.setOnClickListener {
            
            binding.inputText.append("^(3)")
        }

        binding.mode.setOnClickListener {

            binding.inputText.append("%")
        }

        binding.btn0.setOnClickListener {
            binding.inputText.append("0")
        }

        binding.btn1.setOnClickListener {
            binding.inputText.append("1")
        }

        binding.btn2.setOnClickListener {
            binding.inputText.append("2")
        }

        binding.btn3.setOnClickListener {
            binding.inputText.append("3")
        }

        binding.btn4.setOnClickListener {
            binding.inputText.append("4")
        }

        binding.btn5.setOnClickListener {
            binding.inputText.append("5")
        }

        binding.btn6.setOnClickListener {
            binding.inputText.append("6")
        }

        binding.btn7.setOnClickListener {
            binding.inputText.append("7")
        }

        binding.btn8.setOnClickListener {
            binding.inputText.append("8")
        }


        binding.btn9.setOnClickListener {
            binding.inputText.append("9")
        }

        binding.btnDot.setOnClickListener {
            binding.inputText.append(".")
        }


        binding.btnStartBracket.setOnClickListener {
            binding.inputText.append("(")
        }

        binding.btnEndBracket.setOnClickListener {
            binding.inputText.append(")")
        }

        binding.btnMultiplication.setOnClickListener {
            binding.inputText.append("*")
        }

        binding.btnMinus.setOnClickListener {
            binding.inputText.append("-")
        }

        binding.btnPlus.setOnClickListener {
            binding.inputText.append("+")
        }

        binding.btnDivide.setOnClickListener {
            binding.inputText.append("/")
        }
        binding.plusAndMainus.setOnClickListener {
            binding.inputText.append("(-")
        }

        binding.backSpace.setOnClickListener {
            val langth = binding.inputText.length()
            if (langth > 0) {
                binding.inputText.text = binding.inputText.text.subSequence(0, langth - 1)
            }
        }


        binding.btnEqual.setOnClickListener {

            try {

                val tex=binding.inputText.text.toString()
                expression=ExpressionBuilder(tex).build()


                val result= expression.evaluate()
                binding.outPutText.text=result.toString()
            }
            catch (e:Exception){

                Toast.makeText(this, "Error:${e.message}", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
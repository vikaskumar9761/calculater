# calculater
create a calculater in android studio with help of kotlin and xml 

![calculater](https://github.com/user-attachments/assets/57200022-43ad-4cb7-a923-b8fca216b815)

# add dependencies in the "build.gradle" File

implementation ("net.objecthunter:exp4j:0.4.5")

implementation ("net.objecthunter:exp4j:0.4.8")

# XML CODE of the calculater

<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:background="#181818"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">


    <TextView
        android:id="@+id/inputText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text=""
        android:paddingEnd="10dp"
        android:textColor="@color/white"
        android:gravity="end"
        android:layout_above="@id/outPutText"
        android:textSize="40sp"

        />
    
    <TextView
        android:id="@+id/outPutText"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text=""
        android:textColor="@color/white"
        android:gravity="end"
        android:paddingEnd="10dp"
        android:layout_above="@+id/pad1"
        android:textSize="80sp"

        />

    <LinearLayout
        android:id="@+id/pad1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:background="@color/black"
       android:layout_above="@+id/pad"
        android:paddingTop="10dp"
        android:paddingBottom="10dp"
        android:orientation="horizontal">

        <TextView
            android:id="@+id/squareX"
            android:text="x²"
            android:textSize="20sp"
            android:textStyle="bold"
            android:textColor="@color/black"
            android:gravity="center"
            android:layout_width="70dp"
            android:layout_height="40dp"
            android:layout_marginStart="25dp"
            android:background="@drawable/buttonshape" />

        <TextView
            android:id="@+id/cube"
            android:text="x³"
            android:textSize="20sp"
            android:textStyle="bold"
            android:textColor="@color/black"
            android:gravity="center"
            android:layout_width="70dp"
            android:layout_height="40dp"
            android:layout_marginStart="25dp"
            android:background="@drawable/buttonshape"
            />

        <TextView
            android:id="@+id/mode"
            android:text="%"
            android:textSize="20sp"
            android:textStyle="bold"
            android:textColor="@color/black"
            android:gravity="center"
            android:layout_width="70dp"
            android:layout_height="40dp"
            android:layout_marginStart="25dp"
            android:background="@drawable/buttonshape"
            />
        <TextView
            android:id="@+id/backSpace"
            android:textSize="20sp"
            android:textStyle="bold"
            android:textColor="@color/black"
            android:gravity="center"
            android:layout_width="50dp"
            android:layout_height="40dp"
            android:layout_marginStart="25dp"
            android:layout_marginEnd="25dp"
            android:background="@drawable/baseline_backspace_24"
            />


    </LinearLayout>


    <LinearLayout
        android:id="@+id/pad"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:background="@color/black"

        android:orientation="vertical">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginStart="10dp"
            android:layout_marginEnd="10dp"
            android:gravity="center"
            android:orientation="horizontal"
            android:paddingTop="10dp"
            android:paddingBottom="10dp">

            <TextView
                android:id="@+id/btn_ac"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"
                android:background="@drawable/radiusbtn"
                android:fontFamily="@font/arial1"
                android:gravity="center"
                android:text="AC"
                android:textColor="#FF0000"
                android:textSize="30sp" />

            <ImageView
                android:id="@+id/btn_divide"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"
                android:background="@drawable/btn_divide" />

            <ImageView
                android:id="@+id/btn_start_bracket"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"
                android:background="@drawable/btn_start_bracket" />

            <ImageView
                android:id="@+id/btn_end_bracket"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"

                android:layout_marginEnd="20dp"
                android:background="@drawable/btn_end_bracket" />
        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginStart="10dp"
            android:layout_marginEnd="10dp"
            android:gravity="center"
            android:orientation="horizontal"
            android:paddingTop="10dp"
            android:paddingBottom="10dp">

            <ImageView
                android:id="@+id/btn_9"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"
                android:background="@drawable/btn_9" />

            <ImageView
                android:id="@+id/btn_8"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"
                android:background="@drawable/btn_8" />

            <ImageView
                android:id="@+id/btn_7"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"
                android:background="@drawable/btn_7" />

            <ImageView
                android:id="@+id/btn_multiplication"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"
                android:layout_marginEnd="20dp"
                android:background="@drawable/btn_multiplication" />
        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginStart="10dp"
            android:layout_marginEnd="10dp"
            android:gravity="center"
            android:orientation="horizontal"
            android:paddingTop="10dp"
            android:paddingBottom="10dp">

            <ImageView
                android:id="@+id/btn_6"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"
                android:background="@drawable/btn_6" />

            <ImageView
                android:id="@+id/btn_5"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"
                android:background="@drawable/btn_5" />

            <ImageView
                android:id="@+id/btn_4"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"
                android:background="@drawable/btn_4" />

            <ImageView
                android:id="@+id/btn_minus"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"
                android:layout_marginEnd="20dp"
                android:background="@drawable/btn_minus" />
        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginStart="10dp"
            android:layout_marginLeft="5dp"
            android:layout_marginEnd="10dp"
            android:gravity="center"
            android:orientation="horizontal"
            android:paddingTop="10dp"
            android:paddingBottom="10dp">

            <ImageView
                android:id="@+id/btn_3"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"
                android:background="@drawable/btn_3" />

            <ImageView
                android:id="@+id/btn_2"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"
                android:background="@drawable/btn_2" />

            <ImageView
                android:id="@+id/btn_1"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"
                android:background="@drawable/btn_1" />

            <ImageView
                android:id="@+id/btn_plus"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"
                android:layout_marginEnd="20dp"
                android:background="@drawable/btn_plus" />
        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginStart="10dp"
            android:layout_marginEnd="10dp"
            android:gravity="center"
            android:orientation="horizontal"
            android:paddingTop="10dp"
            android:paddingBottom="10dp">

            <TextView
                android:id="@+id/plusAndMainus"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"
                android:background="@drawable/radiusbtn"
                android:gravity="center"
                android:padding="0dp"
                android:text="+/-"
                android:fontFamily="@font/arial1"
                android:textColor="@color/white"
                android:textSize="30sp" />

            <ImageView
                android:id="@+id/btn_0"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"
                android:background="@drawable/btn_0" />

            <ImageView
                android:id="@+id/btn_dot"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"
                android:background="@drawable/btn_dot" />

            <ImageView
                android:id="@+id/btn_equal"
                android:layout_width="70dp"
                android:layout_height="70dp"
                android:layout_marginStart="20dp"
                android:layout_marginEnd="20dp"
                android:background="@drawable/btn_equal" />
        </LinearLayout>
    </LinearLayout>
</RelativeLayout>

# Kotlin code 

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


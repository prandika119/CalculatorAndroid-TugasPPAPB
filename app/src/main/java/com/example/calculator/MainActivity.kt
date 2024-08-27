package com.example.calculator

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        lateinit var firstNum: Number;
        lateinit var operator: String;
        lateinit var secondNum: Number;
        fun getDisplay () :String {
            return binding.operationDisplay.text.toString()
        }

        binding.number1.setOnClickListener {
            binding.operationDisplay.text = getDisplay() + "1"
        }
        binding.number2.setOnClickListener {
            binding.operationDisplay.text = getDisplay() + "2"
        }
        binding.number3.setOnClickListener {

            binding.operationDisplay.text = getDisplay() + "3"
        }
        binding.number4.setOnClickListener {

            binding.operationDisplay.text = getDisplay() + "4"
        }
        binding.number5.setOnClickListener {

            binding.operationDisplay.text = getDisplay() + "5"
        }
        binding.number6.setOnClickListener {

            binding.operationDisplay.text = getDisplay() + "6"
        }
        binding.number7.setOnClickListener {

            binding.operationDisplay.text = getDisplay() + "7"
        }
        binding.number8.setOnClickListener {

            binding.operationDisplay.text = getDisplay() + "8"
        }
        binding.number9.setOnClickListener {

            binding.operationDisplay.text = getDisplay() + "9"
        }
        binding.number0.setOnClickListener {

            binding.operationDisplay.text = getDisplay() + "0"
        }

        fun findFirstNumber (operatorParameter: String){
            firstNum = getDisplay().toInt()
            operator = operatorParameter
            binding.operationDisplay.text = getDisplay()+operatorParameter
        }
        binding.additonButton.setOnClickListener{
            findFirstNumber("+")
        }
        binding.minusButton.setOnClickListener{
            findFirstNumber("-")
        }
        binding.multipleButton.setOnClickListener{
            findFirstNumber("*")
        }
        binding.divideButton.setOnClickListener{
            findFirstNumber("/")
        }
        binding.clearButton.setOnClickListener{
            binding.operationDisplay.text = ""
            binding.resultDisplay.text = ""
        }
        binding.deleteButton.setOnClickListener{

            binding.operationDisplay.text = getDisplay().substring(0, getDisplay().length-1)
        }

        binding.equalButton.setOnClickListener{

            val splitNum = getDisplay().split(operator)
            secondNum = splitNum[1].toInt()
            if (operator.equals("+")){
                val result: Number = firstNum.toInt() + secondNum.toInt()
                binding.resultDisplay.text = result.toString()
            }else if (operator.equals("-")){
                val result: Number = firstNum.toInt() - secondNum.toInt()
                binding.resultDisplay.text = result.toString()
            }else if (operator.equals("*")){
                val result: Number = firstNum.toInt() * secondNum.toInt()
                binding.resultDisplay.text = result.toString()
            }else if (operator.equals("/")){
                val result: Number = firstNum.toFloat() / secondNum.toFloat()
                binding.resultDisplay.text = result.toString()
            }else {
                binding.resultDisplay.text = "error"
            }
        }
    }
}
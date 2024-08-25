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
        binding.number1.setOnClickListener {
            var display = binding.operationDisplay.text.toString()
            binding.operationDisplay.text = display + "1"
        }
        binding.number2.setOnClickListener {
            var display = binding.operationDisplay.text.toString()
            binding.operationDisplay.text = display + "2"
        }
        binding.number3.setOnClickListener {
            var display = binding.operationDisplay.text.toString()
            binding.operationDisplay.text = display + "3"
        }
        binding.number4.setOnClickListener {
            var display = binding.operationDisplay.text.toString()
            binding.operationDisplay.text = display + "4"
        }
        binding.number5.setOnClickListener {
            var display = binding.operationDisplay.text.toString()
            binding.operationDisplay.text = display + "5"
        }
        binding.number6.setOnClickListener {
            var display = binding.operationDisplay.text.toString()
            binding.operationDisplay.text = display + "6"
        }
        binding.number7.setOnClickListener {
            var display = binding.operationDisplay.text.toString()
            binding.operationDisplay.text = display + "7"
        }
        binding.number8.setOnClickListener {
            var display = binding.operationDisplay.text.toString()
            binding.operationDisplay.text = display + "8"
        }
        binding.number9.setOnClickListener {
            var display = binding.operationDisplay.text.toString()
            binding.operationDisplay.text = display + "9"
        }
        binding.number0.setOnClickListener {
            var display = binding.operationDisplay.text.toString()
            binding.operationDisplay.text = display + "0"
        }
        binding.additonButton.setOnClickListener{
            var display = binding.operationDisplay.text.toString()
            firstNum = display.toInt()
            binding.operationDisplay.text = display + "+"
            operator = "+"
        }
        binding.minusButton.setOnClickListener{
            var display = binding.operationDisplay.text.toString()
            firstNum = display.toInt()
            binding.operationDisplay.text = display + "-"
            operator = "-"
        }
        binding.multipleButton.setOnClickListener{
            var display = binding.operationDisplay.text.toString()
            firstNum = display.toInt()
            binding.operationDisplay.text = display + "*"
            operator = "*"
        }
        binding.divideButton.setOnClickListener{
            var display = binding.operationDisplay.text.toString()
            firstNum = display.toInt()
            binding.operationDisplay.text = display + "÷"
            operator = "/"
        }
        binding.clearButton.setOnClickListener{
            binding.operationDisplay.text = ""
        }



        binding.equalButton.setOnClickListener{
            var display = binding.operationDisplay.text.toString()
            val splitNum = display.split(operator)
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
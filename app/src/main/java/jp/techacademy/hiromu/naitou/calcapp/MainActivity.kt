package jp.techacademy.hiromu.naitou.calcapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log
import jp.techacademy.hiromu.naitou.calcapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(){

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.ButtonPlus.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            try {
                intent.putExtra("VALUE1",binding.editText1.text.toString().toDouble())
            }catch(e : NumberFormatException){
                intent.putExtra("VALUE1",binding.editText1.text.toString())
            }
            try {
                intent.putExtra("VALUE2",binding.editText2.text.toString().toDouble())
            }catch(e : NumberFormatException){
                intent.putExtra("VALUE2",binding.editText2.text.toString())
            }
            startActivity(intent)
        }
        binding.ButtonMinus.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            try {
                intent.putExtra("VALUE3",binding.editText1.text.toString().toDouble())
            }catch(e : NumberFormatException){
                intent.putExtra("VALUE3",binding.editText1.text.toString())
            }
            try {
                intent.putExtra("VALUE4",binding.editText2.text.toString().toDouble())
            }catch(e : NumberFormatException){
                intent.putExtra("VALUE4",binding.editText2.text.toString())
            }
            startActivity(intent)
        }
        binding.ButtonMulti.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            try {
                intent.putExtra("VALUE5",binding.editText1.text.toString().toDouble())
            }catch(e : NumberFormatException){
                intent.putExtra("VALUE5",binding.editText1.text.toString())
            }
            try {
                intent.putExtra("VALUE6",binding.editText2.text.toString().toDouble())
            }catch(e : NumberFormatException){
                intent.putExtra("VALUE6",binding.editText2.text.toString())
            }
            startActivity(intent)
        }
        binding.ButtonDiv.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            try {
                intent.putExtra("VALUE7",binding.editText1.text.toString().toDouble())
            }catch(e : NumberFormatException){
                intent.putExtra("VALUE7",binding.editText1.text.toString())
            }
            try {
                intent.putExtra("VALUE8",binding.editText2.text.toString().toDouble())
            }catch(e : NumberFormatException){
                intent.putExtra("VALUE8",binding.editText2.text.toString())
            }
            startActivity(intent)
        }


    }

}

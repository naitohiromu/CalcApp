package jp.techacademy.hiromu.naitou.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import jp.techacademy.hiromu.naitou.calcapp.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        //var value1 : Double? = intent.getStringExtra("VALUE1")?.toDouble()
        //var value2 : Double? = intent.getStringExtra("VALUE2")?.toDouble()
        var value1 : Double = intent.getDoubleExtra("VALUE1",0.0)
        var value2 : Double = intent.getDoubleExtra("VALUE2",0.0)

        var value3 : Double = intent.getDoubleExtra("VALUE3",0.0)
        var value4 : Double = intent.getDoubleExtra("VALUE4",0.0)

        var value5 : Double = intent.getDoubleExtra("VALUE5",0.0)
        var value6 : Double = intent.getDoubleExtra("VALUE6",0.0)

        var value7 : Double = intent.getDoubleExtra("VALUE7",0.0)
        var value8 : Double = intent.getDoubleExtra("VALUE8",0.0)
        //val value1 = intent.getIntExtra("VALUE1",0)
        //val value2 = intent.getIntExtra("VALUE2",0)
        if(value1 != 0.0 && value2 != 0.0){
            binding.textView.text = "${value1 + value2}"
            Log.d("check","+")
        }else if(value3 != 0.0 && value4 != 0.0) {
            binding.textView.text = "${value3 - value4}"
            Log.d("check","-")
        }else if(value5 != 0.0 && value6 != 0.0) {
            binding.textView.text = "${value5 * value6}"
            Log.d("check","*")
        }else if(value7 != 0.0 && value8 != 0.0) {
            binding.textView.text = "${value7 / value8}"
            Log.d("check", "/")
        }
        /*
        var value1 : String? = intent.getStringExtra("VALUE1")
        var valString : String
        var valInt : Int?
        var valDouble : Double
        Log.d("check","${value1?.javaClass?.kotlin}")
        //浮動小数点があるか確認
        try {
            if (value1?.indexOf(".") == 1) {
                val value1: Double = value1.toDouble()
                Log.d("check", "${value1?.javaClass?.kotlin}")
            } else {
                val value1: Int? = value1?.toInt()
                Log.d("check", "${value1?.javaClass?.kotlin}")
            }
        }catch(e: Exception ){
            Log.d("check", "${value1?.javaClass?.kotlin}")
        }
        Log.d("check","${value1?.javaClass?.kotlin}")
        val value2 : String? = intent.getStringExtra("VALUE2")
        try {
            if (value2?.indexOf(".") == 1) {
                val value2: Double? = value2?.toDouble()
                Log.d("check","${value2?.javaClass?.kotlin}")
            } else {
                val value2: Int? = value2?.toInt()
                Log.d("check","${value2?.javaClass?.kotlin}")
            }
        }catch (e: Exception){
            Log.d("check","${value2?.javaClass?.kotlin}")
        }
        Log.d("check","${value2?.javaClass?.kotlin}")
        if(value1 is String? || value2 is String?){
            binding.textView.text = "計算できません。"
        }
        else {
            binding.textView.text = "${value1 + value2}"
        }
        */
    }
}
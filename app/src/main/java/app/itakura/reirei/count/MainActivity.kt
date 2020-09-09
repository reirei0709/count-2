package app.itakura.reirei.count

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count:Int = 0

        plusButton.setOnClickListener {
            count= count + 1

            counter.text = count.toString()

            if (count%3 == 0){
                counter.setTextColor(Color.GREEN)
            }else{
                counter.setTextColor(Color.BLACK)
            }
        }

        minusButton.setOnClickListener {
            count = count - 1

            counter.text = count.toString()

            if (count%3 == 0){
                counter.setTextColor(Color.GREEN)
            }else{
                counter.setTextColor(Color.BLACK)
            }


        }

        clearButton.setOnClickListener {
            count = 0

            counter.text = "0"
        }

    }
}
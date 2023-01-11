package se.nishiyamastudios.intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var mynumber = 0

    lateinit var mytext : TextView
    // var mytext : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // findViewById<TextView>(R.id.fancytext).text = "Ändrad text"

        mytext = findViewById<TextView>(R.id.fancytext)

        mytext.text = "Hej!"

      //  findViewById<Button>(R.id.fancybutton).setOnClickListener {
      //      mytext.text = "Klick!!!"
      //  }

        findViewById<Button>(R.id.fancybutton).setOnClickListener {

            docalc(1)

            if (mytext.text == "13") {
                mytext.text = "Fredag?"
            }



        }

            findViewById<Button>(R.id.minusButton).setOnClickListener {

                docalc(-1)
            }

            findViewById<Button>(R.id.resetButton).setOnClickListener {

                docalc(0)
            }

            findViewById<Button>(R.id.plusButton).setOnClickListener {

                docalc(1)
            }


    }

    fun docalc(calcnumber : Int) {

        if (calcnumber == 0) {
            mynumber = 0
        }

        mynumber += calcnumber

        if (mynumber < 0) {
            mynumber = 0
        }

        mytext.text = mynumber.toString()

    }
}